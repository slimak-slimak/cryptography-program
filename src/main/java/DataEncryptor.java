public class DataEncryptor {
    private AlgorithmStrategy strategy;

    public DataEncryptor(String algType) {
        if ("shift".equals(algType)) {
            this.strategy = new ShiftAlgorithm();
        } else if ("unicode".equals(algType)) {
            this.strategy = new UnicodeAlgorithm();
        } else {
            System.out.println("Invalid mode argument");
        }
    }

    public String encrypt(String data,String mode, int key) {
        return strategy.encrypt(data,mode,key);
    }

    public String decrypt(String data,String mode, int key) {
        return strategy.decrypt(data,mode, key);
    }
}
