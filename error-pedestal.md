user=> ERROR io.pedestal.http.impl.servlet-interceptor - {:msg "error-stylobate triggered", :context {:response {:status 200, :headers {"Content-Length" "34864", "Last-Modified" "Wed, 22 Jul 2020 00:43:15 GMT", "Content-Type" "text/css"}, :body #object[sun.net.www.protocol.jar.JarURLConnection$JarURLInputStream 0x5679bb70 "sun.net.www.protocol.jar.JarURLConnection$JarURLInputStream@5679bb70"]}, :io.pedestal.interceptor.chain/stack (#Interceptor{:name :io.pedestal.http.impl.servlet-interceptor/terminator-injector}), :request {:protocol "HTTP/1.1", :async-supported? true, :remote-addr "127.0.0.1", :servlet-response #object[org.eclipse.jetty.server.Response 0x5599d6b0 "HTTP/1.1 200 \nDate: Sun, 26 Jul 2020 02:14:46 GMT\r\nContent-Length: 34864\r\nLast-Modified: Wed, 22 Jul 2020 00:43:15 GMT\r\nContent-Type: text/css\r\n\r\n"], :servlet #object[io.pedestal.http.servlet.FnServlet 0x6765eba1 "io.pedestal.http.servlet.FnServlet@6765eba1"], :headers {"host" "localhost:8888", "user-agent" "Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:78.0) Gecko/20100101 Firefox/78.0", "cookie" "csrftoken=FTyPekJuF2R5yYyfijMvLJnqtQ9jGNF2mpUf61rMfCK3iV6m6PjpQAEcp8VvW2VH; JSESSIONID=FNt3d5_EwBgImbyJlnoIYa5FeSTlbACcoTrJeZAB; ring-session=81fd87ea-3b9f-48dd-9c05-a9f42f7bb729", "referer" "http://localhost:8888/", "connection" "keep-alive", "accept" "text/css,*/*;q=0.1", "accept-language" "en-US,en;q=0.5", "accept-encoding" "gzip, deflate", "dnt" "1"}, :server-port 8888, :servlet-request #object[org.eclipse.jetty.server.Request 0x2d6fd8d9 "Request(GET //localhost:8888/assets/graphiql/graphiql.css)@2d6fd8d9"], :path-info "/assets/graphiql/graphiql.css", :url-for #object[clojure.lang.Delay 0x3656443f {:status :pending, :val nil}], :uri "/assets/graphiql/graphiql.css", :server-name "localhost", :query-string nil, :path-params {:path "graphiql.css"}, :body #object[org.eclipse.jetty.server.HttpInputOverHTTP 0x2d612813 "HttpInputOverHTTP@2d612813[c=0,q=0,[0]=null,s=STREAM]"], :scheme :http, :request-method :get, :context-path ""}, :bindings {#'io.pedestal.http.route/*url-for* #object[clojure.lang.Delay 0x3656443f {:status :pending, :val nil}]}, :enter-async [#object[io.pedestal.http.impl.servlet_interceptor$start_servlet_async 0x4c649038 "io.pedestal.http.impl.servlet_interceptor$start_servlet_async@4c649038"]], :io.pedestal.interceptor.chain/terminators (#object[io.pedestal.http.impl.servlet_interceptor$terminator_inject$fn__20104 0x6591e6fd "io.pedestal.http.impl.servlet_interceptor$terminator_inject$fn__20104@6591e6fd"]), :servlet-response #object[org.eclipse.jetty.server.Response 0x5599d6b0 "HTTP/1.1 200 \nDate: Sun, 26 Jul 2020 02:14:46 GMT\r\nContent-Length: 34864\r\nLast-Modified: Wed, 22 Jul 2020 00:43:15 GMT\r\nContent-Type: text/css\r\n\r\n"], :route {:path "/assets/graphiql/*path", :method :get, :path-constraints {:path "(.*)"}, :io.pedestal.http.route.prefix-tree/satisfies-constraints? #object[io.pedestal.http.route.prefix_tree$add_satisfies_constraints_QMARK_$fn__16731 0x366b5386 "io.pedestal.http.route.prefix_tree$add_satisfies_constraints_QMARK_$fn__16731@366b5386"], :path-re #"/\Qassets\E/\Qgraphiql\E/(.*)", :path-parts ["assets" "graphiql" :path], :interceptors [#Interceptor{:name }], :route-name :com.walmartlabs.lacinia.pedestal/graphiql-get-assets, :path-params {:path "graphiql.css"}}, :servlet #object[io.pedestal.http.servlet.FnServlet 0x6765eba1 "io.pedestal.http.servlet.FnServlet@6765eba1"], :servlet-request #object[org.eclipse.jetty.server.Request 0x2d6fd8d9 "Request(GET //localhost:8888/assets/graphiql/graphiql.css)@2d6fd8d9"], :url-for #object[clojure.lang.Delay 0x3656443f {:status :pending, :val nil}], :io.pedestal.interceptor.chain/execution-id 19, :servlet-config #object[org.eclipse.jetty.servlet.ServletHolder$Config 0x32189ec8 "org.eclipse.jetty.servlet.ServletHolder$Config@32189ec8"], :async? #object[io.pedestal.http.impl.servlet_interceptor$servlet_async_QMARK_ 0x51369126 "io.pedestal.http.impl.servlet_interceptor$servlet_async_QMARK_@51369126"]}, :line 242}
clojure.lang.ExceptionInfo: org.eclipse.jetty.io.EofException in Interceptor :io.pedestal.http.impl.servlet-interceptor/ring-response -
	at io.pedestal.interceptor.chain$throwable__GT_ex_info.invokeStatic(chain.clj:35)
	at io.pedestal.interceptor.chain$throwable__GT_ex_info.invoke(chain.clj:32)
	at io.pedestal.interceptor.chain$try_f.invokeStatic(chain.clj:57)
	at io.pedestal.interceptor.chain$try_f.invoke(chain.clj:44)
	at io.pedestal.interceptor.chain$leave_all_with_binding.invokeStatic(chain.clj:254)
	at io.pedestal.interceptor.chain$leave_all_with_binding.invoke(chain.clj:237)
	at io.pedestal.interceptor.chain$leave_all$fn__15860.invoke(chain.clj:268)
	at clojure.lang.AFn.applyToHelper(AFn.java:152)
	at clojure.lang.AFn.applyTo(AFn.java:144)
	at clojure.core$apply.invokeStatic(core.clj:665)
	at clojure.core$with_bindings_STAR_.invokeStatic(core.clj:1973)
	at clojure.core$with_bindings_STAR_.doInvoke(core.clj:1973)
	at clojure.lang.RestFn.invoke(RestFn.java:425)
	at io.pedestal.interceptor.chain$leave_all.invokeStatic(chain.clj:266)
	at io.pedestal.interceptor.chain$leave_all.invoke(chain.clj:260)
	at io.pedestal.interceptor.chain$execute.invokeStatic(chain.clj:379)
	at io.pedestal.interceptor.chain$execute.invoke(chain.clj:352)
	at io.pedestal.interceptor.chain$execute.invokeStatic(chain.clj:389)
	at io.pedestal.interceptor.chain$execute.invoke(chain.clj:352)
	at io.pedestal.http.impl.servlet_interceptor$interceptor_service_fn$fn__20129.invoke(servlet_interceptor.clj:351)
	at io.pedestal.http.servlet.FnServlet.service(servlet.clj:28)
	at org.eclipse.jetty.servlet.ServletHolder.handle(ServletHolder.java:873)
	at org.eclipse.jetty.servlet.ServletHandler.doHandle(ServletHandler.java:542)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextHandle(ScopedHandler.java:255)
    at org.eclipse.jetty.server.handler.ContextHandler.doHandle(ContextHandler.java:1345)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:203)
	at org.eclipse.jetty.servlet.ServletHandler.doScope(ServletHandler.java:480)
	at org.eclipse.jetty.server.handler.ScopedHandler.nextScope(ScopedHandler.java:201)
	at org.eclipse.jetty.server.handler.ContextHandler.doScope(ContextHandler.java:1247)
	at org.eclipse.jetty.server.handler.ScopedHandler.handle(ScopedHandler.java:144)
	at org.eclipse.jetty.server.handler.HandlerWrapper.handle(HandlerWrapper.java:132)
	at org.eclipse.jetty.server.Server.handle(Server.java:505)
	at org.eclipse.jetty.server.HttpChannel.handle(HttpChannel.java:370)
	at org.eclipse.jetty.server.HttpConnection.onFillable(HttpConnection.java:267)
	at org.eclipse.jetty.io.AbstractConnection$ReadCallback.succeeded(AbstractConnection.java:305)
	at org.eclipse.jetty.io.FillInterest.fillable(FillInterest.java:103)
	at org.eclipse.jetty.io.ChannelEndPoint$2.run(ChannelEndPoint.java:117)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.runTask(EatWhatYouKill.java:333)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.doProduce(EatWhatYouKill.java:310)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.tryProduce(EatWhatYouKill.java:168)
	at org.eclipse.jetty.util.thread.strategy.EatWhatYouKill.produce(EatWhatYouKill.java:132)
	at org.eclipse.jetty.util.thread.QueuedThreadPool.runJob(QueuedThreadPool.java:698)
	at org.eclipse.jetty.util.thread.QueuedThreadPool$Runner.run(QueuedThreadPool.java:804)
	at java.base/java.lang.Thread.run(Thread.java:834)
Caused by: org.eclipse.jetty.io.EofException: null
	at org.eclipse.jetty.io.ChannelEndPoint.flush(ChannelEndPoint.java:284)
	at org.eclipse.jetty.io.WriteFlusher.flush(WriteFlusher.java:393)
	at org.eclipse.jetty.io.WriteFlusher.write(WriteFlusher.java:277)
	at org.eclipse.jetty.io.AbstractEndPoint.write(AbstractEndPoint.java:380)
	at org.eclipse.jetty.server.HttpConnection$SendCallback.process(HttpConnection.java:826)
	at org.eclipse.jetty.util.IteratingCallback.processing(IteratingCallback.java:241)
	at org.eclipse.jetty.util.IteratingCallback.iterate(IteratingCallback.java:224)
	at org.eclipse.jetty.server.HttpConnection.send(HttpConnection.java:550)
	at org.eclipse.jetty.server.HttpChannel.sendResponse(HttpChannel.java:850)
	at org.eclipse.jetty.server.HttpChannel.write(HttpChannel.java:921)
	at org.eclipse.jetty.server.HttpOutput.write(HttpOutput.java:249)
	at org.eclipse.jetty.server.HttpOutput.write(HttpOutput.java:225)
	at org.eclipse.jetty.server.HttpOutput.write(HttpOutput.java:524)
	at clojure.java.io$fn__11530.invokeStatic(io.clj:307)
	at clojure.java.io$fn__11530.invoke(io.clj:302)
	at clojure.lang.MultiFn.invoke(MultiFn.java:239)
	at clojure.java.io$copy.invokeStatic(io.clj:406)
	at clojure.java.io$copy.doInvoke(io.clj:391)
	at clojure.lang.RestFn.invoke(RestFn.java:425)
	at io.pedestal.http.impl.servlet_interceptor$eval19762$fn__19765.invoke(servlet_interceptor.clj:78)
	at io.pedestal.http.impl.servlet_interceptor$eval19726$fn__19727$G__19717__19734.invoke(servlet_interceptor.clj:38)
    at io.pedestal.http.impl.servlet_interceptor$write_body.invokeStatic(servlet_interceptor.clj:93)
	at io.pedestal.http.impl.servlet_interceptor$write_body.invoke(servlet_interceptor.clj:91)
	at io.pedestal.http.impl.servlet_interceptor$send_response.invokeStatic(servlet_interceptor.clj:170)
	at io.pedestal.http.impl.servlet_interceptor$send_response.invoke(servlet_interceptor.clj:162)
	at io.pedestal.http.impl.servlet_interceptor$leave_ring_response.invokeStatic(servlet_interceptor.clj:229)
	at io.pedestal.http.impl.servlet_interceptor$leave_ring_response.invoke(servlet_interceptor.clj:218)
	at io.pedestal.interceptor.chain$try_f.invokeStatic(chain.clj:54)
	... 41 common frames omitted
Caused by: java.io.IOException: Broken pipe
	at java.base/sun.nio.ch.FileDispatcherImpl.write0(Native Method)
	at java.base/sun.nio.ch.SocketDispatcher.write(SocketDispatcher.java:47)
	at java.base/sun.nio.ch.IOUtil.writeFromNativeBuffer(IOUtil.java:113)
	at java.base/sun.nio.ch.IOUtil.write(IOUtil.java:58)
	at java.base/sun.nio.ch.IOUtil.write(IOUtil.java:50)
	at java.base/sun.nio.ch.SocketChannelImpl.write(SocketChannelImpl.java:466)
	at org.eclipse.jetty.io.ChannelEndPoint.flush(ChannelEndPoint.java:262)
	... 68 common frames omitted



