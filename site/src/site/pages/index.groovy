layout 'layouts/main.groovy', true,
        pageTitle: 'sdkman the Software Development Kit Manager',
        mainContent: contents {
            div(id: 'band', class: 'band') {

            }
            div(id: 'content') {
                include unescaped: 'html/index.html'
            }
        }
