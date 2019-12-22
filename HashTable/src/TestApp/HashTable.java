package TestApp;

public class HashTable {
	private static int INITIAL_SIZE = 16;
	private static HashEntry[] table;

	HashTable(int size) {
		table = new HashEntry[INITIAL_SIZE];
	}
	
	public static HashEntry get(String key) {
		int index = getIndex(key);
		return table[index];
	}
	
	public static void put(String key, int value) {
		HashEntry newEntry = new HashEntry(key, value);
		HashEntry entry;
		
		int index = getIndex(key);
		if (table[index] != null) {
			entry = table[index];
			while (entry.next != null) {
				entry = entry.next;
			}
			entry.next = newEntry;
		} else {
			table[index] = newEntry;
		}
	}
	
	private static int getIndex (String key) {
		int hashCode = key.hashCode();
		int index = hashCode % INITIAL_SIZE;
		return index;
	}
}
