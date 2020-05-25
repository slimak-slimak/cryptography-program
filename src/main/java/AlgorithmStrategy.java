public interface AlgorithmStrategy {
    /**
     * koduje tekst
     * @return
     */
    String encrypt(String data, String mode, int key);

    /**
     * rozkodowuje tekst
     */
    String decrypt(String data, String mode, int key);
}
