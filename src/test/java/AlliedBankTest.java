import org.junit.*;

public class AlliedBankTest  {

    private static AlliedBank ab;
    @BeforeClass
    public static void init(){
        ab = new AlliedBank(12.00);
    }
    @Test
    public void testCreateSavingsAccount() {
        String accNo = ab.createSavingsAccount("haseeb ullah",2000.00,"E 11 , islamabad" ,"03000000000");
        Assert.assertEquals(ab.accountExists(accNo) , true);
        Assert.assertEquals(ab.accountExists("2341") , false);
    }

    @Test
    public void testCreateCheckingAccount() {
        String accNo = ab.createCheckingAccount("Momin ullah",2000.00,"I 11 , islamabad" ,"03000300000");
        Assert.assertEquals(ab.accountExists(accNo) , true);
        Assert.assertEquals(ab.accountExists("23433") , false);
    }

    @Test
    public void testTransferAmount() {
        String accNo = ab.createSavingsAccount("haseeb ullah",2000.00,"E 11 , islamabad" ,"03000000000");
        String acccNo = ab.createCheckingAccount("Momin ullah",2000.00,"I 11 , islamabad" ,"03000300000");

        Assert.assertEquals(ab.transferAmount("1" , "2" ,1000) , true);
        Assert.assertEquals(ab.transferAmount("200" , "2" , 10000) , false);
    }

    @Test
    public void testGetInterestRate() {
        Assert.assertEquals(ab.getInterestRate() , 12.00 , 0);
        Assert.assertNotEquals(ab.getInterestRate() , 13.00 , 0);
    }

}