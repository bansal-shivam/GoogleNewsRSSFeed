package com.algo.demoaws.data;

import java.util.List;

import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "channel", strict = false)
public class RssChannel
{
    @ElementList(inline = true, required = false)
    public List<RssItem> item;

    @Override
    public String toString() {
        return "Channel [item=" + item + "]";
    }
}