package lesson7.simplearraylist;


public class Launcher {

    public static void main(String[] args) {

        SimpleArrayList sal = new SimpleArrayList();
        sal.add("iooooi");
        sal.add("oo");
        sal.add("ii");
        sal.add("oo");
        sal.add("ii");
        sal.add("oo");
        sal.add("ii");
        sal.add("oo");
        System.out.println(sal.contains("oo"));
        System.out.println(sal.size());
        sal.add("ii");
        sal.add("oo");
        sal.add("ii");
        sal.add("oo");
        for (Object o : sal) {
            System.out.println(o);
        }
        System.out.println("________________________");
        System.out.println(sal.size());
        sal.remove("ii");
        System.out.println(sal.size());
        System.out.println(sal.contains(1));
        System.out.println(sal.contains("ii"));

        for (Object o : sal) {
            System.out.println(o);
        }
    }
}
