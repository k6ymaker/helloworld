package com.test;

import com.beust.jcommander.Parameter;

import java.util.ArrayList;
import java.util.List;

public class Arg {

    @Parameter(names = "--help", help = true)
    private boolean help;

    @Parameter
    private List<String> parameters = new ArrayList<>();

    @Parameter(names = { "-log", "-verbose" }, description = "Level of verbosity")
    private Integer verbose = 1;

    @Parameter(names = "-groups", description = "Comma-separated list of group names to be run")
    private String groups;

    @Parameter(names = "-debug", description = "Debug mode")
    private boolean debug = false;

    public List<String> getParameters() {
        return parameters;
    }

    public void setParameters(List<String> parameters) {
        this.parameters = parameters;
    }

    public Integer getVerbose() {
        return verbose;
    }

    public void setVerbose(Integer verbose) {
        this.verbose = verbose;
    }

    public String getGroups() {
        return groups;
    }

    public void setGroups(String groups) {
        this.groups = groups;
    }

    public boolean isDebug() {
        return debug;
    }

    public void setDebug(boolean debug) {
        this.debug = debug;
    }
}
