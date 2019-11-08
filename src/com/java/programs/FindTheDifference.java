package com.java.programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindTheDifference {

	public static void main(String[] args) {
		/*
		 * String s =
		 * "ymbgaraibkfmvocpizdydugvalagaivdbfsfbepeyccqfepzvtpyxtbadkhmwmoswrcxnargtlswqemafandgkmydtimuzvjwxvlfwlhvkrgcsithaqlcvrihrwqkpjdhgfgreqoxzfvhjzojhghfwbvpfzectwwhexthbsndovxejsntmjihchaotbgcysfdaojkjldprwyrnischrgmtvjcorypvopfmegizfkvudubnejzfqffvgdoxohuinkyygbdzmshvyqyhsozwvlhevfepdvafgkqpkmcsikfyxczcovrmwqxxbnhfzcjjcpgzjjfateajnnvlbwhyppdleahgaypxidkpwmfqwqyofwdqgxhjaxvyrzupfwesmxbjszolgwqvfiozofncbohduqgiswuiyddmwlwubetyaummenkdfptjczxemryuotrrymrfdxtrebpbjtpnuhsbnovhectpjhfhahbqrfbyxggobsweefcwxpqsspyssrmdhuelkkvyjxswjwofngpwfxvknkjviiavorwyfzlnktmfwxkvwkrwdcxjfzikdyswsuxegmhtnxjraqrdchaauazfhtklxsksbhwgjphgbasfnlwqwukprgvihntsyymdrfovaszjywuqygpvjtvlsvvqbvzsmgweiayhlubnbsitvfxawhfmfiatxvqrcwjshvovxknnxnyyfexqycrlyksderlqarqhkxyaqwlwoqcribumrqjtelhwdvaiysgjlvksrfvjlcaiwrirtkkxbwgicyhvakxgdjwnwmubkiazdjkfmotglclqndqjxethoutvjchjbkoasnnfbgrnycucfpeovruguzumgmgddqwjgdvaujhyqsqtoexmnfuluaqbxoofvotvfoiexbnprrxptchmlctzgqtkivsilwgwgvpidpvasurraqfkcmxhdapjrlrnkbklwkrvoaziznlpor",
		 * t=
		 * "qhxepbshlrhoecdaodgpousbzfcqjxulatciapuftffahhlmxbufgjuxstfjvljybfxnenlacmjqoymvamphpxnolwijwcecgwbcjhgdybfffwoygikvoecdggplfohemfypxfsvdrseyhmvkoovxhdvoavsqqbrsqrkqhbtmgwaurgisloqjixfwfvwtszcxwktkwesaxsmhsvlitegrlzkvfqoiiwxbzskzoewbkxtphapavbyvhzvgrrfriddnsrftfowhdanvhjvurhljmpxvpddxmzfgwwpkjrfgqptrmumoemhfpojnxzwlrxkcafvbhlwrapubhveattfifsmiounhqusvhywnxhwrgamgnesxmzliyzisqrwvkiyderyotxhwspqrrkeczjysfujvovsfcfouykcqyjoobfdgnlswfzjmyucaxuaslzwfnetekymrwbvponiaojdqnbmboldvvitamntwnyaeppjaohwkrisrlrgwcjqqgxeqerjrbapfzurcwxhcwzugcgnirkkrxdthtbmdqgvqxilllrsbwjhwqszrjtzyetwubdrlyakzxcveufvhqugyawvkivwonvmrgnchkzdysngqdibhkyboyftxcvvjoggecjsajbuqkjjxfvynrjsnvtfvgpgveycxidhhfauvjovmnbqgoxsafknluyimkczykwdgvqwlvvgdmufxdypwnajkncoynqticfetcdafvtqszuwfmrdggifokwmkgzuxnhncmnsstffqpqbplypapctctfhqpihavligbrutxmmygiyaklqtakdidvnvrjfteazeqmbgklrgrorudayokxptswwkcircwuhcavhdparjfkjypkyxhbgwxbkvpvrtzjaetahmxevmkhdfyidhrdeejapfbafwmdqjqszwnwzgclitdhlnkaiyldwkwwzvhyorgbysyjbxsspnjdewjxbhpsvj";
		 * 
		 * String s =
		 * "ibghsuwoinjvjnvcsvcdagrtgcytanupyhvbvkdfareymftssssuuagaunjnwgjtwdpblgroeyxdpsxxjwykkrlskhwzfcudlcvgzxrdbhjicwofhgoseefpivtdrdzjscunptuhvatqlmraixqbibthyobbgxgrlqyxnkzmspavmvwlorvhyhkeesgdzjqtcsqamceycnanyrbwpkdbehxjpnlfzignvogivyxsvmjrwthxhcgpnmlvbxjfvyfplhgrbgkzxzfwankypbuujfgcfavzfosxceyhunznpncptltheztvvyhficimhqazokbkqxbgevhpqdqdxzltvprogysaqrpbampdoqgkqrexucdqainhgmbufvkodrahvqbqwmudzjcekfqsguiaknhauaekrcdffhltgvkizczsambyfwfxexub",
		 * t=
		 * "tupyhvpuegctotajvxiwexfyuxllzrcvejhkjsdnaliihfapggnfovgpnfnvnyyftrhyxijwzqmnoswvndkyparrwydiiacershyxbiwaeggwxkdicbpqzdhrnuueazvjbrnnwtoqusaohsoxtkvrwozygxjktdkyhurgcgbukqzclkdlmcgmirpnqqrkgurnbevtgnmkxxmsarpcqvkuhzletcvcnftctvphvpsxnglvlvubmqfyhbmtwqpbifhsfwhzlppgfagbbvzvxxsywcbufpcepvkyshaqetjguvecaajywdraoadvhzkjgpassdbxbjjoqqffmafbzdaxgknjfuflvodmthmgkfyshsbgeszdzrgplgcomibzadnedheevjncusvyxuqqogqzrxyffabocuhcihamcqsbbbrvdlhtdxkzhkis";
		 */
		// String s = "abcd", t ="abcde";

		String s = "vldrwnhsmdbcsuhggusemqbcmveypftedzxsknlxnilqkfmuhumqurmftdmltzxzwsssmuwdqtevdfcxcziqikqylxpqjkftedqombtegsvyffhrcnjrvyqegnrdnewmxqwssjqketrzhvstyqbfnzgstoyxgpgnlaqhurpiswpytvxolimecfdoihtmumylyqqqbkuvlhkdtculjydyqzasvultfqqxqrtevsbxpzzfxunmnedoujexghavyebagngupynjzkotjpfwdhxmisdvpjclpothzjlnldxfpscpivstfbjaayapdpyacgkrdzbeobjvfccyqxuvnfavtdfqotclnkpdneybdfyeemzbwincnvpqzkukgpdrprevdxppmivfxryokhmgehajxxwumpswnwjfumpnsrrmiabejqbizojnoyahpudbjijwkfugshfflyxdnumsevriyvsjxagzcslsaqgyjqli";
		String t = "pqtefddyldyvlphyskitpbftcuqpnqofkcvxxsmxjjqjwiavdyczoqaocwbsdpncgkzyrpzyjdqmwfeinvdycgagiarqgbbusudpnopfhlhhinspdvzaavbeklwhmlaoulkswnmsaaautcifvepsxbvxsnklgvyrjoevrtqziwqbqrumecomzrflsxgcizwhjquynetduduskkjfopvxdujphtcifxchvgrvirmumesjejwqmgrbmmqrethdupnaxpolusyzvyxfnhvlpbvklleqlfjpxmilzeidrzyzqfcdlwqesfxnwulaffmhysomqgfvpvglazilpnqdotjutyztbeynfgfseusjsmjbxxruygtidtynmphyqtxedtemgzqmsfvskyxtszfnkucuosjotmrwizsbkqfpqnqynqkddsejhhdwmnyjdvxyxatenbryhmecdndxftjcmpbgxgxqgbnpepeqvnuufksrj";
		System.out.println(findTheDifference(s, t));
	}

	public static char findTheDifference(String s, String t) {

		/*
		 * char str_s[] =s.toCharArray(); char str_t[] = t.toCharArray();
		 * 
		 * 
		 * Arrays.sort(str_s); Arrays.sort(str_t);
		 * 
		 * s = String.valueOf(str_s); t = String.valueOf(str_t);
		 * 
		 * System.out.println(s); System.out.println(t);
		 * 
		 * char ch = 0;
		 */

		/*
		 * for(int i=0;i<s.length();i++) { ch = s.charAt(i); s =
		 * s.replaceAll(String.valueOf(ch), ""); t = t.replaceAll(String.valueOf(ch),
		 * ""); if(s.length() == t.length()) { break; } }
		 */
		/*
		 * int i=0; while(s.length()!=t.length()) {
		 * 
		 * ch = t.charAt(i); s = s.replaceAll(String.valueOf(ch), ""); t =
		 * t.replaceAll(String.valueOf(ch), ""); i++; }
		 * 
		 * 
		 * 
		 * return ch;
		 */
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		Map<Character, Integer> hashMap = new HashMap<Character, Integer>();

		for (int i = 0; i < s.length(); i++) {

			if (map.containsKey(s.charAt(i))) {

				map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
			} else {
				map.put(s.charAt(i), 1);
			}
		}

		for (int i = 0; i < t.length(); i++) {

			if (hashMap.containsKey(t.charAt(i))) {

				hashMap.put(t.charAt(i), hashMap.get(t.charAt(i)) + 1);
			} else {
				hashMap.put(t.charAt(i), 1);
			}
		}
		char c =0;
		for(char ch : hashMap.keySet()) {
			if(hashMap.get(ch)!=map.get(ch)) {
				c= ch;
				break;
			}
		}
		return c;
	}
}
