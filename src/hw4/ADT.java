package hw4;

public interface ADT {
	/**
	 * Addes this item to the ADT
	 * @param item
	 * 		Bitstring to add to ADT
	 * @return
	 * 		Key in the structure
	 */
	String add(String item);
	
	/**
	 * Determines if the findItem is in the ADT
	 * @param findItem
	 * 		Item to search for
	 * @return
	 * 		True if it contains, False if not
	 */
	boolean contains(String findItem);
	
	/**
	 * Reverse key-value lookup,  Takes in the
	 * value, returns the key
	 * @param bitString
	 * 		Value of the bitstring
	 * @return
	 * 		Key for that value
	 */
	String retrieveKey(String bitString);
	
	/**
	 * Returns the prefix to the bitString provided
	 * @param findItem
	 * 		Bitstring to look for
	 * @return
	 * 		Key of it's parent
	 */
	String prefixKey(String findItem);
	
	/**
	 * Finds the value from this key
	 * @param key
	 * 		Key to the item
	 * @return
	 * 		Value
	 */
	String keyLookup(String key);
}