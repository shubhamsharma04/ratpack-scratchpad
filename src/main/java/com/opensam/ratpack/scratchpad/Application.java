package com.opensam.ratpack.scratchpad;

import ratpack.server.RatpackServer;

public class Application {

    public static void main(String[] args) throws Exception {
        RatpackServer.start(server -> server.handlers(chain -> chain
                .get(ctx -> ctx.render("If you are seeing this ..... then RUN!!!"))));
    }
}