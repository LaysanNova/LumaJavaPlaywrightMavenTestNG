package base;

import com.microsoft.playwright.Page;

import java.util.Properties;

public abstract class BasePage {
    protected Page page;
    protected Properties properties;

    public BasePage(Page page) {
        this.page = page;
    }

}
