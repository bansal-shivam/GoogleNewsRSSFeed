package com.algo.demoaws;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "item", strict = false)
public class RssItem {
    @Element
    public String title;

    @Override
    public String toString() {
        return "RssItem [title=" + title + "]";
    }
}