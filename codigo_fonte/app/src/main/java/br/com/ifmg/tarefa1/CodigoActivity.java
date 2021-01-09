package br.com.ifmg.tarefa1;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.res.ResourcesCompat;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class CodigoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Escala usada para calcular as distâncias de layout
        int scale = 4;

        // Cria o Linear Layout (layout base para adicionar as outras views)
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(LinearLayout.VERTICAL);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        linearLayout.setBackgroundColor(getResources().getColor(R.color.colorBackground));

        // Título
        TextView titulo = new TextView(this);
        titulo.setTextSize(TypedValue.COMPLEX_UNIT_PT, 12);
        titulo.setText(getResources().getString(R.string.text_title));
        titulo.setTextColor(getResources().getColor(android.R.color.white));
        titulo.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams tituloParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        tituloParams.setMargins(0, 32 * scale, 0, 0);
        titulo.setLayoutParams(tituloParams);

        // Subtítulo
        TextView subtitulo = new TextView(this);
        subtitulo.setText(getResources().getString(R.string.text_subtitle));
        subtitulo.setTextSize(TypedValue.COMPLEX_UNIT_PT, 8);
        subtitulo.setTextColor(getResources().getColor(R.color.colorSubtitle));
        subtitulo.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams subtituloParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        subtituloParams.setMargins(0, 12 * scale, 0, 16 * scale);
        subtitulo.setLayoutParams(subtituloParams);

        // Input de login
        TextInputEditText editLogin = new TextInputEditText(this);
        LinearLayout.LayoutParams editLoginParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        editLogin.setHintTextColor(getResources().getColor(android.R.color.white));
        editLogin.setTextColor(getResources().getColor(android.R.color.white));
        editLogin.setText("Codigo");

        TextInputLayout inputLogin = new TextInputLayout(this);
        LinearLayout.LayoutParams inputLoginParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        inputLoginParams.setMargins(16 * scale, 0,16 * scale,0);

        inputLogin.setLayoutParams(inputLoginParams);
        inputLogin.addView(editLogin, editLoginParams);
        inputLogin.setHint(getResources().getString(R.string.hint_login));

        // Input de senha
        TextInputEditText editPassword = new TextInputEditText(this);
        LinearLayout.LayoutParams editPasswordParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        editPassword.setCompoundDrawablesWithIntrinsicBounds(0, 0, R.drawable.ic_eye, 0);
//        editPassword.setCompoundDrawables(null,null, ResourcesCompat.getDrawable(getResources(), R.drawable.ic_eye, null),null);
        editPassword.setHintTextColor(getResources().getColor(android.R.color.white));
        editPassword.setTextColor(getResources().getColor(android.R.color.white));

        TextInputLayout inputPassword = new TextInputLayout(this);
        LinearLayout.LayoutParams inputPasswordParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        inputPasswordParams.setMargins(16 * scale, 0,16 * scale,0);

        inputPassword.setLayoutParams(inputPasswordParams);
        inputPassword.addView(editPassword, editPasswordParams);
        inputPassword.setHint(getResources().getString(R.string.hint_password));

        // Link "Esqueceu a senha"
        TextView linkForgotPassowrd = new TextView(this);
        linkForgotPassowrd.setClickable(true);
        linkForgotPassowrd.setFocusable(true);
        linkForgotPassowrd.setText(getResources().getString(R.string.link_password_forgot));
        linkForgotPassowrd.setTextColor(getResources().getColor(R.color.colorLink));
        LinearLayout.LayoutParams linkForgotParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        linkForgotParams.setMargins(16 * scale, 16 * scale, 0, 0);
        linkForgotPassowrd.setLayoutParams(linkForgotParams);

        // Link "Gerenciador de senhas"
        TextView linkPasswordManager = new TextView(this);
        linkPasswordManager.setClickable(true);
        linkPasswordManager.setFocusable(true);
        linkPasswordManager.setText(getResources().getString(R.string.link_password_manager));
        linkPasswordManager.setTextColor(getResources().getColor(R.color.colorLink));
        LinearLayout.LayoutParams linkManagerParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        linkManagerParams.setMargins(16 * scale, 8 * scale, 0, 0);
        linkPasswordManager.setLayoutParams(linkManagerParams);

        // Botão de login
        Button btnLogin = new Button(this);
        btnLogin.setText(getResources().getString(R.string.btn_login));
        btnLogin.setTextColor(getResources().getColor(android.R.color.white));
        btnLogin.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        LinearLayout.LayoutParams btnLoginParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 40 * scale);
        btnLoginParams.setMargins(16 * scale, 24 * scale, 16 * scale, 0);
        btnLogin.setLayoutParams(btnLoginParams);

        // Adiciona as views criadas ao Linear Layout
        linearLayout.addView(titulo);
        linearLayout.addView(subtitulo);
        linearLayout.addView(inputLogin);
        linearLayout.addView(inputPassword);
        linearLayout.addView(linkForgotPassowrd);
        linearLayout.addView(linkPasswordManager);
        linearLayout.addView(btnLogin);

        // Seta o layout da tela
        setContentView(linearLayout);
    }
}