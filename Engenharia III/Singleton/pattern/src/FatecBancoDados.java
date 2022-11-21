
public class FatecBancoDados {

	private static FatecBancoDados instance;
    
    public static FatecBancoDados getInstance() {
        if (instance == null) {
            synchronized (FatecBancoDados.class) {
                if (instance == null) {
                    instance = new FatecBancoDados();
                }
            }
        }
        return instance;
    }
}

	
