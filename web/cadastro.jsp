

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>

    <head>
        <title>Au Register Forms by Colorlib</title>

        <!-- Icons font CSS-->
        <link href="cadastro/vendor/mdi-font/css/material-design-iconic-font.min.css" rel="stylesheet"  type="text/css">
        <link href="cadastro/vendor/font-awesome-4.7/css/font-awesome.min.css" rel="stylesheet"  type="text/css">
        <!-- Font special for pages-->
        <link href="https://fonts.googleapis.com/css?family=Poppins:100,100i,200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i" rel="stylesheet">

        <!-- Vendor CSS-->
        <link href="cadastro/vendor/select2/select2.min.css" rel="stylesheet"  type="text/css">
        <link href="cadastro/vendor/datepicker/daterangepicker.css" rel="stylesheet"  type="text/css">

        <!-- Main CSS-->
        <link href="cadastro/css/main.css" rel="stylesheet"  type="text/css">


    </head>

    <body>
        <div class="page-wrapper bg-blue p-t-130 p-b-100 font-poppins">
            <div class="wrapper wrapper--w680">
                <div class="card card-4">
                    <div class="card-body">
                        <h2 class="title">Cadastro pessoal</h2>
                        <form method="POST">
                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Nome</label>
                                        <input class="input--style-4" type="text" name="nome">
                                    </div>
                                </div>
                            </div>

                            <div class="row row-space">
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Email</label>
                                        <input class="input--style-4"  name="email">
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Telefone</label>
                                        <input class="input--style-4" type="text" name="telefone">
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Usuario</label>
                                        <div class="input-group-icon">
                                            <input class="input--style-4" type="text" name="usuario" maxlength="10">
                                        </div>
                                    </div>
                                </div>
                                <div class="col-2">
                                    <div class="input-group">
                                        <label class="label">Senha</label>
                                        <div class="input-group-icon">
                                            <input class="input--style-4" type="password" name="senha" maxlength="10">
                                            <img id="olho" src="cadastro/eye-icon.png" class="input-icon"/>
                                        </div>
                                    </div>
                                </div>
                            </div>

                            <div class="p-t-15">
                                <button class="btn btn--radius-2 btn--blue" type="submit" name="ok">Confirmar</button>
                                <a href="index.jsp"><button class="btn btn--radius-3 btn--blue" type="button"> Cancelar </button></a>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>

        <!-- Jquery JS-->
        <script src="cadastro/vendor/jquery/jquery.min.js" type="bd4002e48ec62a3967f326b8-text/javascript"></script>
        <!-- Vendor JS-->
        <script src="cadastro/vendor/select2/select2.min.js" type="bd4002e48ec62a3967f326b8-text/javascript"></script>
        <script src="cadastro/vendor/datepicker/moment.min.js" type="bd4002e48ec62a3967f326b8-text/javascript"></script>
        <script src="cadastro/vendor/datepicker/daterangepicker.js" type="bd4002e48ec62a3967f326b8-text/javascript"></script>

        <!-- Main JS-->
        <script src="cadastro/js/global.js" type="bd4002e48ec62a3967f326b8-text/javascript"></script>

        <!-- Global site tag (gtag.js) - Google Analytics -->
        <script async src="https://www.googletagmanager.com/gtag/js?id=UA-23581568-13" type="bd4002e48ec62a3967f326b8-text/javascript"></script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js"></script>






        <script type="bd4002e48ec62a3967f326b8-text/javascript">
            window.dataLayer = window.dataLayer || [];
            function gtag(){dataLayer.push(arguments);}
            gtag('js', new Date());

            gtag('config', 'UA-23581568-13');
        </script>



        <script src="cadastro/https://ajax.cloudflare.com/cdn-cgi/scripts/a2bd7673/cloudflare-static/rocket-loader.min.js" data-cf-settings="bd4002e48ec62a3967f326b8-|49" defer=""></script></body><!-- This templates was made by Colorlib (https://colorlib.com) -->
    <script src="cadastro/js/senha.js"></script>
</html>