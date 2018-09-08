/**  

* <p>Title: CaseInsensitiveRequestParameterNameFilter.java</p>  

* <p>Description: </p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月6日  上午10:18:17

* @version 1.0  

*/  
package util;

import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Map;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

import org.springframework.util.LinkedCaseInsensitiveMap;
import org.springframework.web.filter.OncePerRequestFilter;
/**  

* <p>Title: CaseInsensitiveRequestParameterNameFilter.java</p>  

* <p>Description: 网址url忽略大小写</p>  

* <p>Copyright: Copyright (c) 2017</p>  

* <p>Company: 中科立信</p>  

* @author 王冬冬

* @date 2018年8月6日  上午10:18:17

* @version 1.0  

*/
public class CaseInsensitiveRequestParameterNameFilter extends OncePerRequestFilter{
	@Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        filterChain.doFilter(new CaseInsensitiveParameterNameHttpServletRequest(request), response);
    }

    public static class CaseInsensitiveParameterNameHttpServletRequest extends HttpServletRequestWrapper {
        private final LinkedCaseInsensitiveMap<String[]> map = new LinkedCaseInsensitiveMap<>();

        @SuppressWarnings("unchecked")
        public CaseInsensitiveParameterNameHttpServletRequest(HttpServletRequest request) {
            super(request);
            map.putAll(request.getParameterMap());
        }

        @Override
        public String getParameter(String name) {

            String[] array = this.map.get(name);
            if (array != null && array.length > 0)
                return array[0];
            return null;
        }

        @Override
        public Map<String, String[]> getParameterMap() {
            return Collections.unmodifiableMap(this.map);
        }

        @Override
        public Enumeration<String> getParameterNames() {
            return Collections.enumeration(this.map.keySet());
        }

        @Override
        public String[] getParameterValues(String name) {
            return this.map.get(name);
        }

    }
}
