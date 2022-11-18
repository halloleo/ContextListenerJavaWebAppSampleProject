import net.halloleo.basicwebapp.MyDataStore;

public class Play {
    
    public static void main(String[] args) throws Exception {
        MyDataStore myStore = new MyDataStore();
        System.out.println("Hello " + myStore.getSomedata());
    }
}
