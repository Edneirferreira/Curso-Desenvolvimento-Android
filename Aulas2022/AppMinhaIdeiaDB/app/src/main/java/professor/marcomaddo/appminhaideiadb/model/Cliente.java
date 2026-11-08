package professor.marcomaddo.appminhaideiadb.model;

import android.util.Log;

import professor.marcomaddo.appminhaideiadb.api.AppUtil;
import professor.marcomaddo.appminhaideiadb.controller.ICrud;

public class Cliente  implements ICrud {

    private static final String TAG = "Crud";
    private String nome;
    private String email;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir: Nome Cliente: "+getNome());
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar: ");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "deletar: ");
    }

    @Override
    public void listar(){
        Log.i(AppUtil.TAG, "listar: Cliente");
    }

}
