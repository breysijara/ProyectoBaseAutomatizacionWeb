# Screenplay-serenity-cucumber
#ProyectoBaseAutomatizacionWeb


//Metodos utiles
 public void seccionConfiguracionRebate() {
        Actions actions = new Actions(getDriver());
        actions.moveToElement(bntIconTuerca).click().perform();       
    }

    //
 for (int i = 0; i <= limite; i++) {

            String maximo = "[name='listaRangoVolumenEscalonadoDetalle["+ i +"].maximo']";
            String porcentaje = "[name='listaRangoVolumenEscalonadoDetalle["+ i +"].porcentaje']";

            WebElement inputRangoEscalaMaximo = getDriver().findElement(By.cssSelector(maximo));
            WebElement inputRangoEscalaPorcentaje = getDriver().findElement(By.cssSelector(porcentaje));

            inputRangoEscalaMaximo.click();
            inputRangoEscalaPorcentaje.click();
}




    //Selectores
     @FindBy(css = ".visible > .selected > .text")
       WebElement select;

    @FindBy(xpath = "//h3[contains(.,'MARKETING')]")
    WebElement nombreRebateMKT;


    inputNPromotores.sendKeys(Keys.SPACE);
