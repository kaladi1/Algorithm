import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer token = new StringTokenizer(br.readLine());
		HashMap<String, Integer> hm = new HashMap<>();
        
		int n = Integer.parseInt(token.nextToken());
		int m = Integer.parseInt(token.nextToken());
		for (int i = 0; i < n; i++) {
			String word = br.readLine();
			if (word.length() >= m) {
				
				Integer count = hm.getOrDefault(word, 0);
				hm.put(word, count + 1);
			}
		}

		List<String> keyList = new ArrayList<>(hm.keySet());
		keyList.sort(new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {

				if (hm.get(o1) != hm.get(o2)) {
					return Integer.compare(hm.get(o2), hm.get(o1));
				}

				if (o1.length() != o2.length()) {
					return Integer.compare(o2.length(), o1.length());
				}

				return o1.compareTo(o2);
			}
		});
		for (String key : keyList) {
			bw.write(key + "\n");
		}
		bw.flush();
	}
}