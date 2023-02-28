using System;
using WSDL.mensajes;

namespace WSDL.operaciones{
    public class Operaciones : Mensajes{
        
        List<string> Saludar = new List<string>();
        
        public string Saludar(string nombre){
            string msj = nombre;
            Saludar.add(msj);
            return msj;
        }
        public string Mostrar(int id){
            return Saludar[id+1];
        }
    }
}
