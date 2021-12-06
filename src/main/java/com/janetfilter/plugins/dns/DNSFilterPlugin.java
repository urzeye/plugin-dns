package com.janetfilter.plugins.dns;



import com.janetfilter.core.Environment;
import com.janetfilter.core.models.FilterRule;
import com.janetfilter.core.plugin.MyTransformer;
import com.janetfilter.core.plugin.PluginEntry;

import java.util.ArrayList;
import java.util.List;

public class DNSFilterPlugin implements PluginEntry {
    private final List<MyTransformer> transformers = new ArrayList<>();

    @Override
    public void init(Environment environment, List<FilterRule> filterRules) {
        transformers.add(new InetAddressTransformer(filterRules));
    }

    @Override
    public String getName() {
        return "DNS";
    }

    @Override
    public String getAuthor() {
        return "neo";
    }

    @Override
    public String getVersion() {
        return "v1.0.1";
    }

    @Override
    public String getDescription() {
        return "A plugin for the ja-netfilter, it can block dns resolution.";
    }

    @Override
    public List<MyTransformer> getTransformers() {
        return transformers;
    }
}
