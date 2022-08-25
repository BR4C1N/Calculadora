package com.software.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    Integer Operacao = 0;
    Boolean verificaOperacao = true;
    Boolean verificaResultado = true;

    String numeroDigitado = "";
    Double primeiroNumero = 0.0;
    Double segundoNumero = 0.0;
    Double resultado = 0.0;

    Button botao0;
    Button botao1;
    Button botao2;
    Button botao3;
    Button botao4;
    Button botao5;
    Button botao6;
    Button botao7;
    Button botao8;
    Button botao9;

    Button botaoDivisao;
    Button botaoMultiplicacao;
    Button botaoSubtrair;
    Button botaoAdicao;
    Button botaoPonto;
    Button botaoResultado;
    Button botaoApagar;

    TextView campoTexto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Locale.setDefault(Locale.US);

        botao0 = findViewById(R.id.botao0);
        botao1 = findViewById(R.id.botao1);
        botao2 = findViewById(R.id.botao2);
        botao3 = findViewById(R.id.botao3);
        botao4 = findViewById(R.id.botao4);
        botao5 = findViewById(R.id.botao5);
        botao6 = findViewById(R.id.botao6);
        botao7 = findViewById(R.id.botao7);
        botao8 = findViewById(R.id.botao8);
        botao9 = findViewById(R.id.botao9);

        botaoAdicao = findViewById(R.id.botaoSomar);
        botaoSubtrair = findViewById(R.id.botaoSubtrair);
        botaoMultiplicacao = findViewById(R.id.botaoMultiplicar);
        botaoDivisao = findViewById(R.id.botaoDividir);
        botaoApagar = findViewById(R.id.botaoApagar);
        botaoPonto = findViewById(R.id.botaoPonto);
        botaoResultado = findViewById(R.id.botaoResultado);

        campoTexto = findViewById(R.id.campoTexto);

        acaoBotoesNumeros();
        acaoBotoesOperadores();
    }

    public void acaoBotoesNumeros() {
        botao0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("0");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("1");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("2");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("3");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("4");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("5");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("6");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("7");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("8");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botao9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    numeroDigitado = numeroDigitado.concat("9");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botaoPonto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (numeroDigitado.indexOf(".") == -1 && verificaResultado) {
                    numeroDigitado = numeroDigitado.concat(".");

                    campoTexto.setText(numeroDigitado);
                }
            }
        });
    }

    public void acaoBotoesOperadores() {
        botaoApagar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (verificaResultado) {
                    if (numeroDigitado.length() != 0) {
                        StringBuilder str = new StringBuilder(numeroDigitado);
                        str.deleteCharAt(numeroDigitado.length() - 1);

                        numeroDigitado = str.toString();
                    }
                } else {
                    Operacao = 0;
                    verificaOperacao = true;
                    verificaResultado = true;

                    numeroDigitado = "";
                    primeiroNumero = 0.0;
                    segundoNumero = 0.0;
                    resultado = 0.0;
                }

                campoTexto.setText(numeroDigitado);
            }
        });

        botaoDivisao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numeroDigitado.isEmpty() && verificaOperacao) {
                    verificaOperacao = false;
                    Operacao = 1;

                    primeiroNumero = Double.parseDouble(numeroDigitado);

                    numeroDigitado = "";

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botaoMultiplicacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numeroDigitado.isEmpty() && verificaOperacao) {
                    verificaOperacao = false;
                    Operacao = 2;

                    primeiroNumero = Double.parseDouble(numeroDigitado);

                    numeroDigitado = "";

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botaoSubtrair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numeroDigitado.isEmpty() && verificaOperacao) {
                    verificaOperacao = false;
                    Operacao = 3;

                    primeiroNumero = Double.parseDouble(numeroDigitado);

                    numeroDigitado = "";

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botaoAdicao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numeroDigitado.isEmpty() && verificaOperacao) {
                    verificaOperacao = false;
                    Operacao = 4;

                    primeiroNumero = Double.parseDouble(numeroDigitado);

                    numeroDigitado = "";

                    campoTexto.setText(numeroDigitado);
                }
            }
        });

        botaoResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!numeroDigitado.isEmpty() && verificaResultado && Operacao != 0) {
                    verificaResultado = false;

                    segundoNumero = Double.parseDouble(numeroDigitado);

                    if (Operacao == 1 && segundoNumero == 0) {
                        campoTexto.setText("Erro: Divisão por 0");
                    } else {
                        switch (Operacao) {
                            case 1: {
                                resultado = primeiroNumero / segundoNumero;

                                break;
                            }
                            case 2: {
                                resultado = primeiroNumero * segundoNumero;

                                break;
                            }
                            case 3: {
                                resultado = primeiroNumero - segundoNumero;

                                break;
                            }
                            case 4: {
                                resultado = primeiroNumero + segundoNumero;

                                break;
                            }
                        }

                        if (((resultado * 10) % 10) == 0) {
                            campoTexto.setText(new Integer(resultado.intValue()).toString());
                        } else {
                            campoTexto.setText(String.format("%.2f", resultado));
                        }
                    }
                }
            }
        });
    }

}