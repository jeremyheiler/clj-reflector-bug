
(import '(bar Factory Baz Goo))


(def goo (Factory/get))
(.stuff goo)

(comment
(import '[com.sun.jdi Bootstrap])
(def vmm (Bootstrap/virtualMachineManager))
(def conn (.defaultConnector vmm))
(def args (.defaultArguments conn))
(.setValue (get args "main") "foo.Foo")
(def vm (.launch conn args))
(def erm (.eventRequestManager vm))
(def cpr (.createClassPrepareRequest erm))
(.addClassFilter cpr "foo.Foo")
)