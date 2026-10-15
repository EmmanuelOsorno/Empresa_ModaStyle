public class Metodos_AgregarVerificar_ClienteEmpleado {

    //metodo para verificar cliente
    public boolean verificarCliente (int documento){
        boolean existe=false;
        for(Cliente cliente: ListaCliente){
            if(cliente.getDocumento()==documento){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar cliente
    public boolean agregarCliente(Cliente cliente){
        boolean agregado=false;
        boolean existe=verificarCliente(cliente.getDocumento());
        if(existe==false){
            ListaCliente.add(cliente);
            agregado=true;
        }
        return agregado;
    }

    //metodo para verificar empleado
    public boolean verificarEmpleado (int documento){
        boolean existe=false;
        for(Empleado empleado: ListaEmpleado){
            if(empleado.getDocumento()==documento){
                existe=true;
                break;
            }
        }
        return existe;
    }

    //metodo para agregar empleado
    public boolean agregarEmpleado(Empleado empleado){
        boolean agregado=false;
        boolean existe=verificarEmpleado(empleado.getDocumento());
        if(existe==false){
            ListaEmpleado.add(empleado);
            agregado=true;
        }
        return agregado;
    }

}
