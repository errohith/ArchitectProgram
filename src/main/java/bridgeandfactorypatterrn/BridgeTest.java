package bridgeandfactorypatterrn;

import org.testng.annotations.Test;

public class BridgeTest {

    @Test
    public void test1() {
        WebActions impl = DriverFactory.driverFactory(
                DriverTypes.WebDriver,
                BrowserTypes.Edge);
        impl.launch("http://leaftaps.com/opentaps/control/main");
        impl.type("//input[@id='username']", "demosalesmanager");
        impl.type("//input[@id='password']", "crmsfa");
        impl.click("//input[@class='decorativeSubmit']");
        impl.click("//a[contains(text(), 'CRM/SFA')]");
        impl.click("//a[text()='Create Lead']");
        impl.type("//input[@id='createLeadForm_companyName']", "TestLeaf");
        impl.type("//input[@id='createLeadForm_firstName']", "Babu");
        impl.type("//input[@id='createLeadForm_lastName']", "Manickam");
        impl.click("//input[@class='smallSubmit']");
        String st = impl.getText("//span[@id='viewLead_statusId_sp']");
        System.out.println(st);
    }


}
