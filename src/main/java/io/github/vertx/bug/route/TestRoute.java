package io.github.vertx.bug.route;

import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class TestRoute {
  public Router init(Vertx vertx) {
    Router router = Router.router(vertx);

    router.getWithRegex("^.*regex").handler((rc) -> {
      rc.response().end("regex");
    });
    router.get("/check").handler((rc) -> {
      rc.response().end("check");
    });

    return router;
  }

}
