package Registor_Login_form;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Untils_Function
{
    public static  void SelectDayMonthYear(WebElement element,String value)
    {
        Select select= new Select(element);
        select.selectByVisibleText(value);

    }
    public static void EmailWrite(WebElement element)
    {

    }
}
