import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class FlorarieForm{
    private JPanel rootPanel;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton cosDeCumparaturiButton;
    private JLabel nume_site;
    private JLabel mesaj;
    private JLabel gol;
    private JLabel buchete;
    private JLabel buchete_text;
    private JLabel bulbi;
    private JLabel Flori_perene_text;
    private JLabel butasi_trandafiri;
    private JLabel butasi_trandafiri_text;
    private JLabel buchet;
    private ArrayList<String> Cos_cumparaturi= new ArrayList<String>();;
    private double total;

    interface IFloare
    {
        public static final String BOBOC="Boboc";
        public static final String INFLORIT="Inflorit";

        public double getPret();
        public void setNumar(int numar);
        public int getNumar();
        public String getStadiu();
        public String getSoi();
    }

    public class Lalea implements  IFloare
    {
        public static final String TULIP_COOLER_CARDINA="Tulip Cooler Cardina";
        public static final String TULIP_CAMBRIDGE="Tulip Cambridge";
        public static final String TULIP_BLACK_PARROT="Tulip Black Parrot";
        public static final String TULIP_MONTE_CARLO="Tulip Monte Carlo";
        public static final String TULIP_SHIRLEY="Tulip Shirley";
        public static final String TULIP_FLOROSA="Tulip Florosa";
        public static final String TULIP_ALEXANDRU_PUSKIN="Tulip Alexandru Puskin";
        public static final String TULIP_ICE_CREAM="Tulip Ice Cream";

        private final double PRET=4;
        private int _numar;
        private String _stadiu_dezvoltare;
        private String _soi;

        public Lalea()
            {   this._numar=0;
                this._stadiu_dezvoltare="N/A";
                this._soi=TULIP_COOLER_CARDINA;
            }
        public Lalea(double pret, int numar, String stadiu_dezvoltare, String soi)
            {   this._numar=numar;
                this._stadiu_dezvoltare=stadiu_dezvoltare;
                this._soi=soi;
            }

        public double getPret()
            { return this.PRET; }

        public void setNumar(int numar)
            { this._numar=numar; }

        public int getNumar()
            { return this._numar; }

        public String getStadiu()
            { return this._stadiu_dezvoltare; }

        public String getSoi()
            { return this._soi; }

        public String toString()
            {
                StringBuffer sb=new StringBuffer();
                sb.append("Lalea din soiul ");
                sb.append(this._soi);
                sb.append(" in stadiul de ");
                sb.append(this._stadiu_dezvoltare);
                sb.append(" in numar de ");
                sb.append(this._numar);
                sb.append(" la pretul de ");
                sb.append(this._numar*this.PRET);
                sb.append(" lei.");
                 return sb.toString();
            }

    }

    public class Zambila implements  IFloare
    {
        public static final String ZAMBILA_MOV="Zambila mov";
        public static final String ZAMBILA_ALBA="Zambila alba";
        public static final String ZAMBILA_ROZ_DESCHIS="Zambila roz deschis";
        public static final String ZAMBILA_ROZ_INCHIS="Zambila roz inchis";
        public static final String ZAMBILA_GALBENA="Zambila galbena";
        public static final String ZAMBILA_ALBASTRA="Zambila albasta";

        private final double PRET = 3;
        private int _numar;
        private String _stadiu_dezvoltare;
        private String _soi;

        public Zambila()
            {   this._numar=0;
                this._stadiu_dezvoltare="N/A";
                this._soi=ZAMBILA_MOV;
            }
        public Zambila (double pret, int numar, String stadiu_dezvoltare, String soi)
            {   this._numar=numar;
                this._stadiu_dezvoltare=stadiu_dezvoltare;
                this._soi=soi;
            }

        public double getPret()
            {   return this.PRET;  }

        public void setNumar(int numar)
            {   this._numar=numar;  }

        public int getNumar()
            {   return this._numar; }

        public String getStadiu()
            {   return this._stadiu_dezvoltare; }

        public String getSoi()
            {   return this._soi;   }

        public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Zambila din soiul ");
                sb.append(this._soi);
                sb.append(" in stadiul de ");
                sb.append(this._stadiu_dezvoltare);
                sb.append(" in numar de ");
                sb.append(this._numar);
                sb.append(" la pretul de ");
                sb.append(this._numar*this.PRET);
                sb.append(" lei");
                return sb.toString();
            }
    }

    public class Gladiola implements  IFloare
    {
        public static final String GLADIOLUS_VARIETY_GREEN_FAIRY="Gladiolus Variety Green Fairy";
        public static final String GLADIOLUS_RUMBA_FRIZZLE="Gladiolus Rumba Frizzle";
        public static final String GLADIOLUS_SPARKLER="Gladiolus Sparkler";
        public static final String GLADIOLUS_BLACK_JACK="Gladiolus Black Jack";
        public static final String GLADIOLUS_PETER_PEARS="Gladiolus Peter Pears";
        public static final String GLADIOLUS_NABIUS_FRIZZLE="Gladiolus Nabius Frizzle";
        public static final String GLADIOLUS_BLUE_ISLE="Gladiolus Blue Isle";

        private final double PRET= 5 ;
        private int _numar;
        private int _inaltime;
        private String _stadiu_dezvoltare;
        private String _soi;

        public Gladiola()
            {
                this._numar=0;
                this._stadiu_dezvoltare="N/A";
                this._soi=GLADIOLUS_VARIETY_GREEN_FAIRY;
            }
        public Gladiola(double pret, int numar, String stadiu_dezvoltare, String soi)
            {
                this._numar=numar;
                this._stadiu_dezvoltare=stadiu_dezvoltare;
                this._soi=soi;
            }

        public double getPret()
            {   return this.PRET;  }

        public void setNumar(int numar)
            {   this._numar=numar;  }

        public int getNumar()
            {   return this._numar; }

        public String getStadiu()
            { return this._stadiu_dezvoltare; }

        public String getSoi()
            { return this._soi; }

        public String toString()
            {   StringBuffer sb=new StringBuffer();
                sb.append("Gladiola din soiul ");
                sb.append(this._soi);
                sb.append(" in stadiul de ");
                sb.append(this._stadiu_dezvoltare);
                sb.append(" in numar de ");
                sb.append(this._numar);
                sb.append(" la pretul de ");
                sb.append(this._numar*this.PRET);
                sb.append(" lei.");
                return sb.toString();
            }
    }

    public class Trandafir implements  IFloare
    {
        public static final String DAME_DE_COEUR ="Dame de Coeur";
        public static final String CASANOVA="Casanova";
        public static final String ICEBERG="Iceberg";
        public static final String KRONENBOURG="Kronenbourg";
        public static final String QUEEN_ELIZABETH="Queen Elizabeth";

        private final double PRET = 7;
        private int _numar;
        private String _stadiu_dezvoltare;
        private String _soi;

        public Trandafir()
        {
            this._numar=0;
            this._stadiu_dezvoltare="N/A";
            this._soi=DAME_DE_COEUR;
        }

        public Trandafir(double pret, int numar, String stadiu_dezvoltare, String soi)
        {
            this._numar=numar;
            this._stadiu_dezvoltare=stadiu_dezvoltare;
            this._soi=soi;
        }

        public double getPret()
        {return this.PRET; }

        public void setNumar(int numar)
        { this._numar=numar;}

        public int getNumar()
        { return this._numar; }

        public String getStadiu()
        { return this._stadiu_dezvoltare; }

        public String getSoi()
        {  return this._soi; }

        public String toString()
        {   StringBuffer sb=new StringBuffer();
            sb.append("Trandafir din soiul ");
            sb.append(this._soi);
            sb.append(" in stadiul de ");
            sb.append(this._stadiu_dezvoltare);
            sb.append(" in numar de ");
            sb.append(this._numar);
            sb.append(" la pretul de ");
            sb.append(this._numar*this.PRET);
            sb.append(" lei.");
            return sb.toString();
        }
    }

    public class Buchet {
        public static final String[] BUCHET= {"Buchet varianta 1","Buchet varianta 2","Buchet varianta 3","Buchet varianta 4", "Buchet varianta 5", "Buchet varianta 6"};
        private final double PRET=79.99;

        public int getN()
        { return 6; }

        public String getBuchet(int i)
        {  return BUCHET[i]; }

        public double getPret()
        { return PRET; }

        public String toString(int i)
        {
            StringBuffer sb= new StringBuffer();
            sb.append(BUCHET[i]);
            sb.append(" in valoare de ");
            sb.append(PRET);
            sb.append("lei.");
                return sb.toString();
        }
    }

    public FlorarieForm()
    {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

              ArrayList<JRadioButton> r= new ArrayList<JRadioButton>();
              JButton btnpc= new JButton("Adaugare in cos");
              Buchet buchet=new Buchet();
              for(int i=0; i<buchet.getN();i++)
              {
                  r.add(new JRadioButton(buchet.getBuchet(i)));
              }

              ButtonGroup g= new ButtonGroup();
              for(int i=0;i<r.size();i++)
              {
                  g.add(r.get(i));
              }

              JPanel panel= new JPanel();
              JDialog d1=new JDialog();
              panel.setPreferredSize(new Dimension(800, 400));
              panel.setLayout(new FlowLayout());
              panel.add(new JLabel(new ImageIcon("Buchet_var1.jpg")));
              panel.add(r.get(0));
              panel.add(new JLabel(new ImageIcon("Buchet_var2.jpg")));
              panel.add(r.get(1));
              panel.add(new JLabel(new ImageIcon("Buchet_var3.jpg")));
              panel.add(r.get(2));
              panel.add(new JLabel(new ImageIcon("Buchet_var4.jpg")));
              panel.add(r.get(3));
              panel.add(new JLabel(new ImageIcon("Buchet_var5.jpg")));
              panel.add(r.get(4));
              panel.add(new JLabel(new ImageIcon("Buchet_var6.jpg")));
              panel.add(r.get(5));
              panel.add(new JLabel("Pret: "+buchet.getPret()) );
              panel.add(btnpc);
              d1.add(panel);
              d1.pack();
              d1.setVisible(true);

              btnpc.addActionListener(new ActionListener() {
                  @Override
                  public void actionPerformed(ActionEvent e) {
                      int ok=0;
                     for(int i=0; i<r.size() && ok==0 ;i++)
                     {
                         if(r.get(i).isSelected())
                         {  JOptionPane.showMessageDialog(null, "Ati adaugat in cos varianta "+(i+1) +" de buchet");
                             ok=1;
                             Cos_cumparaturi.add(buchet.toString(i));
                             total+=buchet.getPret();
                         }

                     }
                     if(ok==0)
                     { JOptionPane.showMessageDialog(null, "Nu ati selectat nici un buchet."); }
                     }
              });
            }
        });
        btn2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<JRadioButton> r= new ArrayList<JRadioButton>();
                JButton btn_aleg_cat= new JButton("Alegere categorie");

                r.add(new JRadioButton("Lalele"));
                r.add(new JRadioButton("Zambile"));
                r.add(new JRadioButton("Gladiole"));

                ButtonGroup g= new ButtonGroup();
                g.add(r.get(0));
                g.add(r.get(1));
                g.add(r.get(2));

                JPanel panel= new JPanel();
                JDialog d1=new JDialog();
                panel.setPreferredSize(new Dimension(800, 600));
                panel.setLayout(new FlowLayout());
                panel.add(new JLabel(new ImageIcon("Lalele.jpg")));
                panel.add(r.get(0));
                panel.add(new JLabel(new ImageIcon("Zambile.jpg")));
                panel.add(r.get(1));
                panel.add(new JLabel(new ImageIcon("Gladiole.jpg")));
                panel.add(r.get(2));
                panel.add(btn_aleg_cat);
                d1.add(panel);
                d1.pack();
                d1.setVisible(true);

                btn_aleg_cat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int ok1=0;
                        ArrayList<JRadioButton> variante= new ArrayList<JRadioButton>();
                        JButton btn_aleg_varianta= new JButton("Adauga in cos");
                        JRadioButton[] stadiu = new JRadioButton[2];

                        for(int i=0; i<r.size() && ok1==0 ;i++) {
                            if(r.get(i).isSelected() && r.get(i).getText().equals("Lalele"))
                            {
                                Lalea l= new Lalea();
                                stadiu[0]=new JRadioButton(l.BOBOC);
                                stadiu[1]=new JRadioButton(l.INFLORIT);

                                ButtonGroup gs= new ButtonGroup();
                                gs.add(stadiu[0]);
                                gs.add(stadiu[1]);

                                JSpinner sp= new JSpinner(new SpinnerNumberModel(0,0,10,1)) ;

                                variante.add(new JRadioButton(l.TULIP_COOLER_CARDINA));
                                variante.add(new JRadioButton(l.TULIP_CAMBRIDGE));
                                variante.add(new JRadioButton(l.TULIP_BLACK_PARROT));
                                variante.add(new JRadioButton(l.TULIP_MONTE_CARLO));
                                variante.add(new JRadioButton(l.TULIP_SHIRLEY));
                                variante.add(new JRadioButton(l.TULIP_FLOROSA));
                                variante.add(new JRadioButton(l.TULIP_ALEXANDRU_PUSKIN));
                                variante.add(new JRadioButton(l.TULIP_ICE_CREAM));

                                ButtonGroup g= new ButtonGroup();
                                for(int j=0;j<variante.size(); j++)
                                {
                                    g.add(variante.get(j));
                                }

                                JPanel panel= new JPanel();
                                JDialog d1=new JDialog();
                                panel.setPreferredSize(new Dimension(900, 500));
                                panel.setLayout(new FlowLayout());
                                panel.add(new JLabel(new ImageIcon("Tulip_Cooler_Cardina.jpg")));
                                panel.add(variante.get(0));
                                panel.add(new JLabel(new ImageIcon("Tulip_Cambridge.jpg")));
                                panel.add(variante.get(1));
                                panel.add(new JLabel(new ImageIcon("Tulip_Black_Parrot.jpg")));
                                panel.add(variante.get(2));
                                panel.add(new JLabel(new ImageIcon("Tulip_Monte_Carlo.jpg")));
                                panel.add(variante.get(3));
                                panel.add(new JLabel(new ImageIcon("Tulip_Shirley.jpg")));
                                panel.add(variante.get(4));
                                panel.add(new JLabel(new ImageIcon("Tulip_Florosa.jpg")));
                                panel.add(variante.get(5));
                                panel.add(new JLabel(new ImageIcon("Tulip_Alexandru_Puskin.jpg")));
                                panel.add(variante.get(6));
                                panel.add(new JLabel(new ImageIcon("Tulip_Ice_Cream.jpg")));
                                panel.add(variante.get(7));

                                panel.add(new JLabel("Introduceti numarul e bucati:"));
                                panel.add(sp);
                                panel.add(new JLabel( "Alegeti stadiul de dezvoltare"));
                                panel.add(stadiu[0]);
                                panel.add(stadiu[1]);
                                panel.add(new JLabel(" Pret pe bucata: "+ l.getPret()+" lei."));
                                panel.add(btn_aleg_varianta);
                                d1.add(panel);
                                d1.pack();
                                d1.setVisible(true);
                                ok1=1;

                                btn_aleg_varianta.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        int okf=-1;
                                        for(int j=0;j<variante.size() && okf==-1;j++)
                                        {
                                            if(variante.get(j).isSelected())
                                            {
                                                okf=j;
                                            }
                                        }
                                         if(okf==-1){
                                             JOptionPane.showMessageDialog(null, "Nu ati introdus soiul!");
                                         }
                                         else {
                                             if(sp.getValue().equals(0))
                                             {
                                                 JOptionPane.showMessageDialog(null, "Nu ati introdus nr de bucati!");
                                             }
                                             else
                                             {
                                                 if(!stadiu[0].isSelected() && !stadiu[1].isSelected())
                                                    {
                                                      JOptionPane.showMessageDialog(null, "Nu ati introdus stadiul de dezvoltare!");
                                                    }
                                                 else {   int optiune =JOptionPane.showConfirmDialog(null,"Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs" ,JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                                                        if(optiune==0)
                                                            {
                                                                int numar= (int)sp.getValue();
                                                                if(stadiu[0].isSelected())
                                                                {
                                                                    Lalea lalea=new Lalea(l.getPret(), numar,stadiu[0].getText(), variante.get(okf).getText());
                                                                    Cos_cumparaturi.add(lalea.toString());
                                                                    total+=lalea.getNumar()*lalea.getPret();
                                                                }
                                                                else
                                                                {
                                                                    Lalea lalea=new Lalea(l.getPret(), numar,stadiu[1].getText(), variante.get(okf).getText());
                                                                    Cos_cumparaturi.add(lalea.toString());
                                                                    total+=lalea.getNumar()*lalea.getPret();
                                                                }
                                                                JOptionPane.showMessageDialog(null,"Produsul a fost adaugat in cos");
                                                            }
                                                        else
                                                        {
                                                            JOptionPane.showMessageDialog(null, "Produsul nu a fost adaugat in cos");
                                                        }


                                                 }
                                             }
                                         }
                                    }

                                });
                            }

                            if(r.get(i).isSelected() && r.get(i).getText().equals("Zambile"))
                            {
                                Zambila z= new Zambila();

                                stadiu[0]=new JRadioButton(z.BOBOC);
                                stadiu[1]=new JRadioButton(z.INFLORIT);

                                ButtonGroup gs= new ButtonGroup();
                                gs.add(stadiu[0]);
                                gs.add(stadiu[1]);

                                variante.add(new JRadioButton(z.ZAMBILA_MOV));
                                variante.add(new JRadioButton(z.ZAMBILA_ALBA));
                                variante.add(new JRadioButton(z.ZAMBILA_ROZ_DESCHIS));
                                variante.add(new JRadioButton(z.ZAMBILA_ROZ_INCHIS));
                                variante.add(new JRadioButton(z.ZAMBILA_GALBENA));
                                variante.add(new JRadioButton(z.ZAMBILA_ALBASTRA));


                                ButtonGroup g= new ButtonGroup();
                                for(int j=0;j<variante.size(); j++)
                                {
                                    g.add(variante.get(j));
                                }

                                JPanel panel= new JPanel();
                                JDialog d1=new JDialog();

                                panel.setPreferredSize(new Dimension(900, 500));
                                panel.setLayout(new FlowLayout());
                                panel.add(new JLabel(new ImageIcon("Zambila_Mov.png")));
                                panel.add(variante.get(0));
                                panel.add(new JLabel(new ImageIcon("Zambila_Alba.jpg")));
                                panel.add(variante.get(1));
                                panel.add(new JLabel(new ImageIcon("Zambila_Roz_Deschis.jpg")));
                                panel.add(variante.get(2));
                                panel.add(new JLabel(new ImageIcon("Zambila_Roz_Inchis.jpg")));
                                panel.add(variante.get(3));
                                panel.add(new JLabel(new ImageIcon("Zambila_Galbena.jpg")));
                                panel.add(variante.get(4));
                                panel.add(new JLabel(new ImageIcon("Zambila_Albastra.jpg")));
                                panel.add(variante.get(5));

                                panel.add(new JLabel("Introduceti numarul e bucati:"));
                                JSpinner sp= new JSpinner(new SpinnerNumberModel(0,0,10,1));
                                panel.add(sp);

                                panel.add(new JLabel( "Alegeti stadiul de dezvoltare"));
                                panel.add(stadiu[0]);
                                panel.add(stadiu[1]);

                                panel.add(new JLabel(" Pret pe bucata: "+ z.getPret() + "lei."));
                                panel.add(btn_aleg_varianta);
                                d1.add(panel);
                                d1.pack();
                                d1.setVisible(true);
                                ok1=1;

                                btn_aleg_varianta.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        int okf=-1;
                                        for(int j=0;j<variante.size() && okf==-1;j++)
                                        {
                                            if(variante.get(j).isSelected())
                                            {
                                                okf=j;
                                            }
                                        }
                                        if(okf==-1){
                                            JOptionPane.showMessageDialog(null, "Nu ati introdus soiul!");
                                        }
                                        else {
                                            if(sp.getValue().equals(0))
                                            {
                                                JOptionPane.showMessageDialog(null, "Nu ati introdus nr de bucati!");
                                            }
                                            else
                                            {
                                                if(!stadiu[0].isSelected() && !stadiu[1].isSelected())
                                                {
                                                    JOptionPane.showMessageDialog(null, "Nu ati introdus stadiul de dezvoltare!");
                                                }
                                                else {  int optiune =JOptionPane.showConfirmDialog(null,"Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs" ,JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                                                    if(optiune==0)
                                                    {
                                                        int numar= (int)sp.getValue();
                                                        if(stadiu[0].isSelected())
                                                        {
                                                            Zambila zambila=new Zambila(z.getPret(), numar,stadiu[0].getText(), variante.get(okf).getText());
                                                            Cos_cumparaturi.add(zambila.toString());
                                                            total+=zambila.getNumar()*zambila.getPret();

                                                        }
                                                        else
                                                        {
                                                            Zambila zambila=new Zambila(z.getPret(), numar,stadiu[1].getText(), variante.get(okf).getText());
                                                            Cos_cumparaturi.add(zambila.toString());
                                                            total+=zambila.getNumar()*zambila.getPret();

                                                        }
                                                        JOptionPane.showMessageDialog(null,"Produsul a fost adaugat in cos");
                                                    }
                                                    else
                                                    {
                                                        JOptionPane.showMessageDialog(null, "Produsul nu a fost adaugat in cos");
                                                    }


                                                }
                                            }
                                        }
                                    }

                                });
                            }
                            if(r.get(i).isSelected() && r.get(i).getText().equals("Gladiole"))
                            {
                                Gladiola gl= new Gladiola();

                                stadiu[0]=new JRadioButton(gl.BOBOC);
                                stadiu[1]=new JRadioButton(gl.INFLORIT);

                                ButtonGroup gs= new ButtonGroup();
                                gs.add(stadiu[0]);
                                gs.add(stadiu[1]);

                                variante.add(new JRadioButton(gl.GLADIOLUS_VARIETY_GREEN_FAIRY));
                                variante.add(new JRadioButton(gl.GLADIOLUS_RUMBA_FRIZZLE));
                                variante.add(new JRadioButton(gl.GLADIOLUS_SPARKLER));
                                variante.add(new JRadioButton(gl.GLADIOLUS_BLACK_JACK));
                                variante.add(new JRadioButton(gl.GLADIOLUS_PETER_PEARS));
                                variante.add(new JRadioButton(gl.GLADIOLUS_NABIUS_FRIZZLE));
                                variante.add(new JRadioButton(gl.GLADIOLUS_BLUE_ISLE));


                                ButtonGroup g= new ButtonGroup();
                                for(int j=0;j<variante.size(); j++)
                                {
                                    g.add(variante.get(j));
                                }

                                JPanel panel= new JPanel();
                                JDialog d1=new JDialog();

                                panel.setPreferredSize(new Dimension(2000, 500));
                                panel.setLayout(new FlowLayout());
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Variety_Green_Fairy.jpg")));
                                panel.add(variante.get(0));
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Rumba_Frizzle.jpg")));
                                panel.add(variante.get(1));
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Sparkler.jpg")));
                                panel.add(variante.get(2));
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Black_Jack.jpg")));
                                panel.add(variante.get(3));
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Peter_Pears.jpg")));
                                panel.add(variante.get(4));
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Nabius_Frizzle.jpg")));
                                panel.add(variante.get(5));
                                panel.add(new JLabel(new ImageIcon("Gladiolus_Blue_Isle.jpg")));
                                panel.add(variante.get(6));

                                panel.add(new JLabel("Introduceti numarul e bucati:"));
                                JSpinner sp= new JSpinner(new SpinnerNumberModel(0,0,10,1));
                                panel.add(sp);

                                panel.add(new JLabel( "Alegeti stadiul de dezvoltare"));
                                panel.add(stadiu[0]);
                                panel.add(stadiu[1]);

                                panel.add(new JLabel(" Pret pe bucata:"+ gl.getPret()+" lei."));
                                panel.add(btn_aleg_varianta);
                                d1.add(panel);
                                d1.pack();
                                d1.setVisible(true);
                                ok1=1;

                                btn_aleg_varianta.addActionListener(new ActionListener() {
                                @Override
                                public void actionPerformed(ActionEvent e) {
                                    int okf=-1;
                                    for(int j=0;j<variante.size() && okf==-1;j++)
                                    {
                                        if(variante.get(j).isSelected())
                                        {
                                            okf=j;
                                        }
                                    }
                                    if(okf==-1){
                                        JOptionPane.showMessageDialog(null, "Nu ati introdus soiul!");
                                    }
                                    else {
                                        if(sp.getValue().equals(0))
                                        {
                                            JOptionPane.showMessageDialog(null, "Nu ati introdus nr de bucati!");
                                        }
                                        else
                                        {
                                            if(!stadiu[0].isSelected() && !stadiu[1].isSelected())
                                            {
                                                JOptionPane.showMessageDialog(null, "Nu ati introdus stadiul de dezvoltare!");
                                            }
                                            else {     int optiune =JOptionPane.showConfirmDialog(null,"Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs" ,JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                                                if(optiune==0)
                                                {
                                                    int numar= (int)sp.getValue();
                                                    if(stadiu[0].isSelected())
                                                    {
                                                        Gladiola gladiola=new Gladiola(gl.getPret(), numar,stadiu[0].getText(), variante.get(okf).getText());
                                                        Cos_cumparaturi.add(gladiola.toString());
                                                        total+=gladiola.getNumar()*gladiola.getPret();

                                                    }
                                                    else
                                                    {
                                                        Gladiola gladiola=new Gladiola(gl.getPret(), numar,stadiu[1].getText(), variante.get(okf).getText());
                                                        Cos_cumparaturi.add(gladiola.toString());
                                                        total+=gladiola.getNumar()*gladiola.getPret();

                                                    }
                                                    JOptionPane.showMessageDialog(null,"Produsul a fost adaugat in cos");
                                                }
                                                else
                                                {
                                                    JOptionPane.showMessageDialog(null, "Produsul nu a fost adaugat in cos");
                                                }


                                            }
                                        }
                                    }
                                }

                            });
                            }
                        }
                        if(ok1==0)
                        {   JOptionPane.showMessageDialog(null, "Nu ati selectat nici o categorie.");   }
                }

                });
        }
    });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog d= new JDialog();
                JPanel panel= new JPanel();
                JButton btn_aleg_varianta= new JButton("Adauga in cos");

                Trandafir t= new Trandafir();
                JRadioButton[] stadiu =new JRadioButton[2];
                stadiu[0]=new JRadioButton(t.BOBOC);
                stadiu[1]=new JRadioButton(t.INFLORIT);

                ButtonGroup gs= new ButtonGroup();
                gs.add(stadiu[0]);
                gs.add(stadiu[1]);

                panel.setPreferredSize(new Dimension(500, 500));
                panel.setLayout(new FlowLayout());
                ArrayList<JRadioButton> r= new ArrayList<JRadioButton>();
                r.add(new JRadioButton("Dame de Coeur"));
                r.add(new JRadioButton("Casanova"));
                r.add(new JRadioButton("Iceberg"));
                r.add(new JRadioButton("Kronenbourg"));
                r.add(new JRadioButton("Queen Elizabeth"));
                ButtonGroup g= new ButtonGroup();

                for(int j=0;j<r.size(); j++)
                {
                    g.add(r.get(j));
                }

                panel.add(new JLabel(new ImageIcon("Dame_de_Coeur.jpg")));
                panel.add(r.get(0));
                panel.add(new JLabel(new ImageIcon("Casanova.jpg")));
                panel.add(r.get(1));
                panel.add(new JLabel(new ImageIcon("Iceberg.jpg")));
                panel.add(r.get(2));
                panel.add(new JLabel(new ImageIcon("Kronenburg.jpg")));
                panel.add(r.get(3));
                panel.add(new JLabel(new ImageIcon("Queen_Elizabeth.jpg")));
                panel.add(r.get(4));

                panel.add(new JLabel("Introduceti numarul e bucati:"));
                JSpinner sp= new JSpinner(new SpinnerNumberModel(0,0,10,1));
                panel.add(sp);
                panel.add(new JLabel( "Alegeti stadiul de dezvoltare"));
                panel.add(stadiu[0]);
                panel.add(stadiu[1]);
                panel.add(new JLabel(" Pret pe bucata: "+ t.getPret()+" lei."));
                panel.add(btn_aleg_varianta);
                d.add(panel);
                d.pack();
                d.setVisible(true);

                btn_aleg_varianta.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        int okf=-1;
                        for(int j=0;j<r.size() && okf==-1;j++)
                        {
                            if(r.get(j).isSelected())
                            {
                                okf=j;
                            }
                        }
                        if(okf==-1){
                            JOptionPane.showMessageDialog(null, "Nu ati introdus soiul!");
                        }
                        else {
                            if(sp.getValue().equals(0))
                            {
                                JOptionPane.showMessageDialog(null, "Nu ati introdus nr de bucati!");
                            }
                            else
                            {
                                if(!stadiu[0].isSelected() && !stadiu[1].isSelected())
                                {
                                    JOptionPane.showMessageDialog(null, "Nu ati introdus stadiul de dezvoltare!");
                                }
                                else {   int optiune =JOptionPane.showConfirmDialog(null,"Sunteti sigur ca doriti sa plasati produsul in cos?", "Confirmare produs" ,JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
                                    if(optiune==0)
                                    {
                                        int numar= (int)sp.getValue();
                                        if(stadiu[0].isSelected())
                                        {
                                            Trandafir trandafir=new Trandafir(t.getPret(), numar,stadiu[0].getText(), r.get(okf).getText());
                                            Cos_cumparaturi.add(trandafir.toString());
                                            total+=trandafir.getNumar()*trandafir.getPret();

                                        }
                                        else
                                        {
                                            Trandafir trandafir=new Trandafir(t.getPret(), numar,stadiu[1].getText(), r.get(okf).getText());
                                            Cos_cumparaturi.add(trandafir.toString());
                                            total+=trandafir.getNumar()*trandafir.getPret();

                                        }
                                        JOptionPane.showMessageDialog(null,"Produsul a fost adaugat in cos");
                                    }
                                    else
                                    {
                                        JOptionPane.showMessageDialog(null, "Produsul nu a fost adaugat in cos");
                                    }
                                }
                            }
                        }
                    }

                });
            }
        });
        cosDeCumparaturiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog df= new JDialog();
                JPanel panelf= new JPanel();
                panelf.setPreferredSize(new Dimension(600, 500));
                panelf.setLayout(new FlowLayout());
                if(!Cos_cumparaturi.isEmpty()) {
                    for (int i = 0; i < Cos_cumparaturi.size(); i++)
                    {   panelf.add(new JLabel(Cos_cumparaturi.get(i))); }
                    panelf.add(new JLabel("Total achizitie: "+total+ " lei"));
                }
                else
                {   panelf.add(new JLabel("Cosul de cumparaturi este gol."));   }

                df.add(panelf);
                df.pack();
                df.setVisible(true);

            }
        });
    }

    public static void main (String args[])
    {
        JFrame frame= new JFrame("Flora.ro");
        frame.setContentPane(new FlorarieForm().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

        private void createUIComponents() {
            // TODO: place custom component creation code here
            buchete = new JLabel(new ImageIcon("Buchete.png"));
            bulbi= new JLabel(new ImageIcon("Bulbi.jpg"));
            butasi_trandafiri= new JLabel(new ImageIcon("Butasi.jpg"));

        }
    }
