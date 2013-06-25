package com.example;

import com.googlecode.utterlyidle.BasePath;
import com.googlecode.utterlyidle.RestApplication;
import com.googlecode.utterlyidle.dsl.BindingBuilder;
import com.googlecode.utterlyidle.modules.Module;

import java.net.URL;

import static com.googlecode.totallylazy.URLs.packageUrl;
import static com.googlecode.utterlyidle.ApplicationBuilder.application;
import static com.googlecode.utterlyidle.dsl.DslBindings.bindings;
import static com.googlecode.utterlyidle.dsl.StaticBindingBuilder.in;
import static com.googlecode.utterlyidle.modules.Modules.bindingsModule;

public class Main extends RestApplication {
    public Main(BasePath basePath) {
        super(basePath);
    }

    public static void main(String[] args) {
        int port = 8181;
        if(args.length > 0) {
            port = Integer.parseInt(args[0]);
        }
        application().addAnnotated(MainResource.class).add(staticFileModule(packageUrl(Main.class))).start(port);
    }

    private static Module staticFileModule(URL url) {
        return bindingsModule(bindings(in(url).path("")));
    }
}