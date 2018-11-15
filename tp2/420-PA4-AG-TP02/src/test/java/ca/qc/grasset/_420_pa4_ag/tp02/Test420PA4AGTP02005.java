package ca.qc.grasset._420_pa4_ag.tp02;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import ca.qc.grasset._420_pa4_ag.tp02.commons.AbstractFunctionalTest;

public final class Test420PA4AGTP02005
    extends AbstractFunctionalTest {

    public Test420PA4AGTP02005() {

        super();
    }

    @Test
    public void test() {

        // À compléter...

    }

    @Override
    protected void validate() {

        WebElement element = getDriver().findElement(By.xpath("//*[@id=\"arr_date_2\"]"));

        String actualValue = element.getAttribute("value");
        Assert.assertTrue("02/12/2018".equals(actualValue));

        element = getDriver().findElement(By.xpath("//*[@id=\"dep_date_2\"]"));

        actualValue = element.getAttribute("value");
        Assert.assertTrue("03/12/2018".equals(actualValue));
    }

}
