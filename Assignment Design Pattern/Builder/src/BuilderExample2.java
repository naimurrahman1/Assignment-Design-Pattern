public class BuilderExample2 {
    public static void main(String []args)
    {
        ProductionOfficier profficier=new ProductionOfficier();
        PhoneBuilder samsungBuilder=new SamsungBuilder();
        PhoneBuilder huweiBuilder=new HuweiBuilder();

        profficier.setPhoneBuilder(samsungBuilder);
        profficier.constructPhone();
        Phone phone1 = profficier.getPhone();
        System.out.println("Components of Samsung Phone: \n"+ phone1.PhoneComponents());

        System.out.println("-------------------");

        profficier.setPhoneBuilder(huweiBuilder);
        profficier.constructPhone();
        Phone phone2=profficier.getPhone();
        System.out.println("Components of Huwei Phone: \n"+ phone2.PhoneComponents());



    }
}
