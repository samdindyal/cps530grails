package cps530grails

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        // "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')

        "/" {
          controller  = 'StaticPages'
          action      = 'index'
        }

        "/conclusion" {
          controller  = 'StaticPages'
          action      = 'conclusion'
        }

        "/credits" {
          controller  = 'StaticPages'
          action      = 'credits'
        }
    }
}
