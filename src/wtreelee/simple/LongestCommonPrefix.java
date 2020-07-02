package wtreelee.simple;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
      StringBuilder str = new StringBuilder();
      if (strs.length <= 0) {
        str.append("");
      }else if (strs.length == 1) {
        str.append(strs[0]);
      }else {
        for (int i = 0; i < strs.length-1 ; i++) {
          String st = "";
          if (strs[i].length() < strs[i+1].length()){
            st = strs[i];
            strs[i] = strs[i+1];
            strs[i+1] = st;
          }
        }
        for (int i = 0; i <= strs[strs.length-1].length()-1 ; i++) {
          for (int j = 0; j< strs.length-1;j++) {
            if (strs[j].toCharArray()[i] == strs[j+1].toCharArray()[i]) {
              if (j+1 == strs.length-1) {
                str.append(strs[j].toCharArray()[i]);
              }
            }else {
              return str.toString();
            }
          }
        }
      }
      return str.toString();
    }

  public static void main(String[] args) {
    String strs[] = {"add","adsd","addw"};
    System.out.println(LongestCommonPrefix.longestCommonPrefix(strs));
  }

}
