package lastAndDetailDesc.structType.adapter;

public class Client {
    public static void main(String[] args){
        NewClassAdapter adapter = new NewClassAdapter(new OldClass());
        adapter.skip();
    }
}
