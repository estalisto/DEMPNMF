<%-- 
    Document   : index
    Created on : 12-feb-2017, 22:28:05
    Author     : CIMA2015
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">


    <!DOCTYPE html>
<html>
<head>
    
  <!-- Content Wrapper. Contains page content -->
  <div>

<ol class="breadcrumb">
    <li><a href="#" onclick="usuarios();">Usuarios</a></li>
          <li><a href="#" onclick="cambio_clave();" >Cambio Clave</a></li>
      </ol>
      
      <div class="col-md-6">

       

          <div class="box box-danger">
            <div class="box-header with-border bg-yellow"   >
              <h3 class="box-title" >Cambio Clave</h3>
            </div>
               <form name="form" action="usuarios" method="get" class="well">
                    
               <div class="form-group">
                    <label>Usuario: </label>
                    <input type="text" class="form-control" id="nombre" placeholder="Ingrese su usuario"  required="required" name="nombre" onchange="validador()">
               </div>
                <div id="found" class="form-group has-success" style="display: none"> <!--hidden-->
                        <span class="help-block">Usuario Registrado.</span>
                    </div>
                    <div id="nada" class="form-group has-warning" style="display: none"> <!--hidden-->
                        <span class="help-block">Usuario no registrado.</span>
                    </div>
           
                  <div class="form-group">
                    <label for="exampleInputClave2">Nueva Clave: </label>
                    <input type="password" class="form-control" id="newclave" placeholder="Ingrese nueva clave " required="required" name="newclave" disabled="true">
                  </div>
                
              
                  
                  <div class="form-group">
                    <label for="exampleInputClave3">Confirmar Clave: </label>
                    <input type="password" class="form-control" id="confirmaclave" placeholder="Confirme nueva clave " required="required" name="confirmaclave" disabled="true">
                  </div>
                
                
                <div class="form-group">
                  <input id="btncambio_clave" type="submit" value="Cambiar Contraseña" class="btn btn-primary"  title="Cambio contraseña" disabled="true">                       
                </div>
            </form>
              <!-- /.box-body -->
          </div>
                 
          <!-- /.box -->

        </div>
      
  </div>
  <!-- /.content-wrapper -->
 <script src="dist/js/valida_usuario.js"></script> 
 <script src="dist/js/usuario.js"></script>


</body>
</html>


