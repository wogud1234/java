package _06_컬렉션프레임워크.app.ex04_stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

    Deque<String> history;
    private String currentPage = null;

    public BrowserHistory() {
        history = new ArrayDeque<>();
    }

    public void visitPage(String url) {
        if(currentPage != null)
            history.push(url);
        currentPage = url;
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if(!history.isEmpty()) {
            currentPage = history.pop();
            System.out.println("뒤로 가기: " + currentPage);
            return currentPage;
        }
        return null;
    }
}
