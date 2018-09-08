/**  

* <p>Title: UserManager.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月16日  上午10:26:31

* @version 1.0  

*/  
package util;


/**  

* <p>Title: UserManager.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年7月16日  上午10:26:31

* @version 1.0  

*/
public class UserManager {
	public static String md5Pswd(String email ,String pswd){
		pswd = String.format("%s#%s", email,pswd);//按照字符串拼接字符串来格式化 如 aaa#bbb
		pswd = MathUtil.getMD5(pswd);
		return pswd;
	}
}
