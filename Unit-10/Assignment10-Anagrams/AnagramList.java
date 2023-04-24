import java.util.ArrayList;

public class AnagramList
{
  // Initialize Variable
  private final ArrayList<String> anagrams;

  // Create New List and Sort
  public AnagramList(String word)
  {
    anagrams = new ArrayList<String>();
    // Calls completeAnagrams with given word
    completeAnagrams("", word);
    // Calls sortAnagrams to resort anagrams
    sortAnagrams();
  }

  // Add Anagrams to ArrayList anagrams
  private void completeAnagrams(String start, String end)
  {
    if (end.length() <= 1)
    {
      anagrams.add(start + end);
    }
    else
    {
      for (int i = 0; i < end.length(); i++)
      {
        if (end.substring(0, i).indexOf(end.substring(i, i + 1)) < 0)
        {
          completeAnagrams(start + end.substring(i, i + 1), end.substring(0, i) + end.substring(i + 1));
        }
      }
    }
  }

  // Sorts ArrayList anagrams
  private void sortAnagrams()
  {
    for( int i = 1; i < anagrams.size(); i++)
    {
      int pos = i;
      while (pos > 0 && anagrams.get(i).compareTo(anagrams.get(pos - 1)) < 0)
      {
        pos--;
      }
      anagrams.add(pos, anagrams.remove(i));
    }
  }

  // Searches anagrrams for given term
  public int searchAnagrams(String target)
  {
    for (int i = 0; i < anagrams.size(); i++)
    {
      if (anagrams.get(i).equals(target))
      {
        return i;
      }
    }
    return -1;
  }

  // Used to get list of anagrams externally, do not remove
  public ArrayList<String> getAnagrams()
  {
    return anagrams;
  }
}