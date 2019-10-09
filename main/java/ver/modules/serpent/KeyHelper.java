package ver.modules.serpent;

public class KeyHelper {
    /* public static byte[] keyMixing() {

     }
 */
    public static byte[] makeKeyFixLength(byte[] key, int length) {
        byte[] newKey = new byte[length];
        if (key.length < length) {
            System.arraycopy(key, 0, newKey, 0, key.length);
            newKey[key.length] = (byte) 1;
        } else
            return key;
        return newKey;
    }
}
