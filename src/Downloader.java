import java.util.*;
import java.io.*;
import java.net.URL;
import org.jsoup.Jsoup;

public class Downloader {

    public static void writeFile(URL path, String content) throws Exception {
        String relative = path.getFile();
        String target = "downloaded/" + relative + ".html";
        File f = new File(target);

        FileOutputStream fs = null;
        PrintStream ps = null;
        try {
            f.getParentFile().mkdirs();
            fs = new FileOutputStream(f);
            ps = new PrintStream(fs);
            ps.print(content);
        } finally {
            ps.close();
            fs.close();
        }
    }


    // Throw Exception so we don't have to worry about checked exceptions
    public static void main(String[] args) throws Exception {
        URL start = new URL("http://en.wikipedia.org/wiki/America");
        writeFile(start, U.slurp(start));
    }

    static class Queue {
        // URIs of downloaded files
        java.util.Set<String> downloaded = new HashSet<String>();
        public void push(Task t){
        }
    }
    
    static class Task {}
}

/**
 * A general Utility class, just for convenience. Mostly stolen from
 * clojure implementations, but vastly simpler and less useful.
 */
class U {
    public static void println(Object u){
        System.out.println(u);
    }

    public static String slurp(URL url) throws IOException {
        InputStream is = url.openStream();
        Reader r = new InputStreamReader(is);
        try {
            StringBuilder b = new StringBuilder();
            for(;;){
                int c = r.read();
                if (c<0) {
                    break;
                }
                b.append((char)c);
            }
            return b.toString();
        } finally {
            is.close();
            r.close();
        }
    }

    public static interface IFn<T>{
        T invoke(Object... args);
    }
    
    public static IFn<Boolean> complement(final IFn<Boolean> fn){
        IFn<Boolean> fn2 = new IFn<Boolean>(){
            public Boolean invoke(Object...args){
                return !fn.invoke(args);
            }
        };
        return fn2;
    }

    public static <T> List<T> filter(IFn<Boolean> pred, List<T> list){
        List<T> out = new ArrayList<T>();
        for(T x : list){
            if(pred.invoke(x)){
                out.add(x);
            }
        }
        return out;
    }

    public static <T> List<T> remove(final IFn<Boolean> pred, List<T> list){
        return filter(complement(pred), list);
    }

    
}
