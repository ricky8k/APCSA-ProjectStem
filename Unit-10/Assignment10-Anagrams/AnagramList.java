import java.util.ArrayList;

public class AnagramList {
  private final ArrayList<String> anagrams;
  private ArrayList<String> duplicate;

  public AnagramList(String word) {
    anagrams = new ArrayList<String>();
    duplicate = new ArrayList<String>();

    completeAnagrams("", word);
    for (String s: duplicate) {
      if (!anagrams.contains(s))
        anagrams.add(s);
    }

    sortAnagrams();
  }
  private void completeAnagrams(String start, String end) {
    if (end.length() == 0) 
      duplicate.add(start);
    else {
      for (int i = 0; i < end.length(); i++)
        completeAnagrams(start + end.substring(i, i+1), end.substring(0, i) + end.substring(i+1, end.length()));
    }
  }

  private void sortAnagrams() {
    for (int i = 0; i < anagrams.size(); i++) {
      for (int j = i + 1; j < anagrams.size(); j++) {
        if (anagrams.get(i).compareTo(anagrams.get(j)) > 0)
          anagrams.add(i, anagrams.remove(j));
      }
    }
  }

  public int searchAnagrams(String target) {
    return binarySearch(anagrams, target, 0, anagrams.size() - 1);
  }

  public int binarySearch(ArrayList<String> list, String key, int start, int end) {
    int mid = (start + end) / 2;

    if (key.compareTo(list.get(mid)) == 0)
      return mid;
    if (end < start) 
      return -1;
    if (key.compareTo(list.get(mid)) < 0)
      return binarySearch(anagrams, key, start, mid-1);
    if (key.compareTo(list.get(mid)) > 0)
      return binarySearch(anagrams, key, mid+1, end);
    
    return -1;
  }
  
  public ArrayList<String> getAnagrams() {
    return anagrams;
  }
}
