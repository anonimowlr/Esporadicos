/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotinasportal;

import conexaoJDBC.Conector;
import dao.TjscDAO;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static rotinasportal.Coletas.driver;
import static rotinasportal.Coletas.wait;

/**
 *
 * @author f5078775
 */
public class ColetaTJSC {

    Coletas coletas = new Coletas();
    TjscDAO tjscDAO = new TjscDAO();
    Conector con = new Conector();

    public void iniciar() throws Throwable {

        createList();
        lerLista();

    }

    private void createList() {

        coletas.autenticarUsuario();
    }

    private void lerLista() throws Throwable {
        Statement st = con.conectar().createStatement();

        Actions action = new Actions(driver);

        int lidos = 1;
        String sql = tjscDAO.ler();

        ResultSet rsCaptura = st.executeQuery(sql);

        rsCaptura.last();

        int qtdReg = (rsCaptura.getRow());

        rsCaptura.first();
        if (qtdReg > 0) {
            boolean temRegistro = true;
            while (temRegistro == true) {

                String subconta = "";
                String titular = "";
                String cnpj = "";
                String npj = rsCaptura.getString("npj");
                String proc = rsCaptura.getString("proc");

                if (rsCaptura.getString("proc").equals("")) {
                    subconta = "Numero do processo não preenchido";
                    tjscDAO.update(npj, subconta);
                } else {
                    Thread.sleep(200);
                }

                coletas.isAlertPresent();

                if (coletas.isElementPresentXpath(driver, "/html/body/div[1]/section/div[3]/div[2]/form/button[2]")) {
                    coletas.clickElementXpath(driver, "/html/body/div[1]/section/div[3]/div[2]/form/button[2]");
                    coletas.clickElementXpath(driver, "/html/body/div[1]/section/div[3]/div[2]/form/button[2]");
                }

                if (procuraSequencia("Incidente:", driver.getPageSource())) {
                    driver.findElement(By.name("processo")).clear();
                    driver.findElement(By.name("processo")).sendKeys(proc);
                    Thread.sleep(200);
                    coletas.clickElementXpath(driver, "/html/body/div[1]/section/div[3]/div[2]/form/div[1]/div[2]/div/button");
                    Thread.sleep(200);

                    if (coletas.isElementPresentXpath(driver, "/html/body/div[1]/section/div[4]/form/div[2]/div/div/div/div[1]/a/span")) {

                        JavascriptExecutor js = (JavascriptExecutor) driver;
                        js.executeScript("tipoSelecionadoChanged()","Depósito em subconta já existente");

                        Select dropdown = new Select(driver.findElement(By.name("tipoDeposito")));
                        //coletas.clickElementXpath(driver, "/html/body/div[1]/section/div[4]/form/div[2]/div/div/div/div[1]/a/span");
                        dropdown.selectByVisibleText("Depósito em subconta já existente");

                    }

                    // wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("incidente2g")));
                    // No. of columns
                    //List<WebElement> cols = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[2]/div/div/form/table/tbody/tr[3]/td/fieldset/table/tbody/tr/td/table[2]/thead/tr/th"));
                    //System.out.println("No. of Columns " + cols.size());
                    // No. of rows
                    List<WebElement> rows = driver.findElements(By.xpath("//table/tbody"));

                    for (int i = 0; i < rows.size(); i++) {
                        subconta = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/form/div[3]/div[2]/table/tbody/tr[" + (i + 1) + "]/td[2]/span")).getText();
                        titular = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/form/div[3]/div[2]/table/tbody/tr[" + (i + 1) + "]/td[3]/span")).getText();
                        cnpj = driver.findElement(By.xpath("/html/body/div[1]/section/div[4]/form/div[3]/div[2]/table/tbody/tr[" + (i + 1) + "]/td[4]/span")).getText();
                        //System.out.println(subconta + " - " + titular + " - " + cnpj);
                        tjscDAO.update(npj, subconta, titular, cnpj);

                    }
                    rsCaptura.next();
                    qtdReg--;
                }

            }
        }
    }

    public static boolean procuraSequencia(String sequencia, String pagina) {
        String resposta = null;
        boolean respostaFinal = false;
        for (int i = 0; i < (pagina.length() - (sequencia.length())); i++) {
            resposta = pagina.substring(i, i + sequencia.length());
            if (resposta.equals(sequencia)) {
                respostaFinal = true;
            }
        }

        return respostaFinal;
    }

}
