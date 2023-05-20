package com.bdd.step;

import com.bdd.page.ListPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class ListSteps extends ScenarioSteps {

    private ListPage listPage;

    @Step
    public void cargarPagina() {
        listPage.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void search() throws InterruptedException {
        listPage.enterSearchCriteria();
    }

    @Step
    public List<String> valitedResulList() {
       return   listPage.getAllResults();
    }

    /*
    @Step
    public void deberia_ver_resultados_con_palabras(String palabra){
        List<String> resultados = listPage.obtenerresultado();
        resultados.replaceAll(String::toLowerCase);
        for (int i = 0; i <resultados.size() ; i++) {
           log.println(resultados.get(i));
        }
        assertThat(resultados, Matchers.everyItem(Matchers.containsString(palabra)));
    }

     */
}
