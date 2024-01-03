package Test;
public class Dummy {

    public static void main(String args[])
    {
    	DummyRelated m = new DummyRelated();
        String n= "Vivek";
        String s="Meena";
        m.set_name(n);
        m.set_id(s);
        System.out.println(m.get_id());
        System.out.println(m.get_Name());

    }

}
