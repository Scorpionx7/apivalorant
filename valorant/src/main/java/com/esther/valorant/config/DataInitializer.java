package com.esther.valorant.config;

import com.esther.valorant.entities.Agente;
import com.esther.valorant.entities.Habilidades;
import com.esther.valorant.entities.Mapa;
import com.esther.valorant.entities.enums.Tecla;
import com.esther.valorant.repository.AgenteRepository;
import com.esther.valorant.repository.MapaRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DataInitializer {

    @Autowired
    private AgenteRepository agenteRepository;

    @Autowired
    private MapaRepository mapaRepository;

    @PostConstruct
    public void inicializarDados(){
        if(agenteRepository.count() ==0){

            // AGENTES

            // 1. Jett
            Agente jett = new Agente();
            jett.setName("Jett");
            jett.setFuncao("Duelista");
            jett.setNacionalidade("Sul-Coreana");

            Habilidades jettX = new Habilidades("Tormenta de Aço", "EQUIPE um conjunto de facas de arremesso altamente precisas.", Tecla.X, jett);
            Habilidades jettE = new Habilidades("Brisa de Impulso", "ATIVE para preparar uma rajada de vento por tempo limitado.", Tecla.E, jett);
            Habilidades jettQ = new Habilidades("Corrente Ascendente", "INSTANTANEAMENTE impele Jett bem alto no ar.", Tecla.Q, jett);
            Habilidades jettC = new Habilidades("ERUPÇÃO DAS BRUMAS", "Lança INSTANTANEAMENTE um projétil que se expande numa breve nuvem que obscurece a visão ao bater numa superfície. ", Tecla.C, jett);

            jett.setHabilidades(List.of(jettX, jettE, jettQ, jettC));
            agenteRepository.save(jett);

            //2. Phoenix
            Agente phoenix = new Agente();
            phoenix.setName("Phoenix");
            phoenix.setFuncao("Duelista");
            phoenix.setNacionalidade("Britânico");

            Habilidades phoenixX = new Habilidades("RENASCIMENTO","Revive após a morte durante sua ultimate.", Tecla.X, phoenix);
            Habilidades phoenixC = new Habilidades("LABAREDA","Cria uma parede de fogo que cura.", Tecla.C, phoenix);
            Habilidades phoenixE = new Habilidades("MÃOS QUENTES","Arremessa uma bola de fogo que explode.", Tecla.E, phoenix);
            Habilidades phoenixQ = new Habilidades("BOLA CURVA","EQUIPE um orbe de chamas que avança em curva e detona pouco após o lançamento.", Tecla.Q, phoenix);

            phoenix.setHabilidades(List.of(phoenixX, phoenixC, phoenixE, phoenixQ));
            agenteRepository.save(phoenix);

            //3. Sage

            Agente sage = new Agente();
            sage.setName("Sage");
            sage.setFuncao("Sentinela");
            sage.setNacionalidade("Chinesa");

            Habilidades sageX = new Habilidades("Ressurreição", "Revive um aliado caído.", Tecla.X, sage);
            Habilidades sageC = new Habilidades("Orbe de Barreira", "Cria uma barreira sólida.", Tecla.C, sage);
            Habilidades sageE = new Habilidades("Orbe Curativo", "Cura aliados ou a si mesma.", Tecla.E, sage);
            Habilidades sageQ = new Habilidades("Orbe Lentidão", "Cria uma área que desacelera inimigos.", Tecla.Q, sage);

            sage.setHabilidades(List.of(sageX, sageC, sageE, sageQ));
            agenteRepository.save(sage);

            //4. Sova
            Agente sova = new Agente();
            sova.setName("Sova");
            sova.setFuncao("Iniciador");
            sova.setNacionalidade("Russo");

            Habilidades sovaX = new Habilidades("Fúria do Caçador", "Lança raios penetrantes para eliminar inimigos.", Tecla.X, sova);
            Habilidades sovaC = new Habilidades("Drone Coruja", "Envia um drone para marcar inimigos.", Tecla.C, sova);
            Habilidades sovaE = new Habilidades("Flecha Rastreadora", "Dispara uma flecha que detecta inimigos próximos.", Tecla.E, sova);
            Habilidades sovaQ = new Habilidades("Flecha de Choque", "Dispara uma flecha explosiva que causa dano.", Tecla.Q, sova);

            sova.setHabilidades(List.of(sovaX, sovaC, sovaE, sovaQ));
            agenteRepository.save(sova);

            // 5. Reyna
            Agente reyna = new Agente();
            reyna.setName("Reyna");
            reyna.setFuncao("Duelista");
            reyna.setNacionalidade("Mexicana");

            Habilidades reynaX = new Habilidades("IMPERATRIZ", "Entra em um estado de frenesi.", Tecla.X, reyna);
            Habilidades reynaC = new Habilidades("OLHAR VORAZ", "EQUIPE um olho etéreo e destrutível.", Tecla.C, reyna);
            Habilidades reynaQ = new Habilidades("Devorar", "Inimigos abatidos por Reyna deixam Orbes de Alma que duram 3s. INSTANTANEAMENTE consome um Orbe de Alma próximo, curando-se de forma rápida por um curto período.", Tecla.Q, reyna);
            Habilidades reynaE = new Habilidades("DISPENSAR", "INSTANTANEAMENTE consome um Orbe de Alma próximo, ficando inatingível por um curto período.", Tecla.E, reyna);

            reyna.setHabilidades(List.of(reynaX, reynaC, reynaQ, reynaE));
            agenteRepository.save(reyna);

            // 6. Brimstone
            Agente brimstone = new Agente();
            brimstone.setName("Brimstone");
            brimstone.setFuncao("Controlador");
            brimstone.setNacionalidade("Norte-Americano");

            Habilidades brimstoneX = new Habilidades("ATAQUE ORBITAL", "Lança um ataque orbital devastador.", Tecla.X, brimstone);
            Habilidades brimstoneQ = new Habilidades("INCENDIÁRIO", "EQUIPE um lançador de granadas incendiárias.", Tecla.Q, brimstone);
            Habilidades brimstoneE = new Habilidades("FUMAÇA CELESTE", "Coloca fumaça em pontos estratégicos.", Tecla.E, brimstone);
            Habilidades brimstoneC = new Habilidades("SINALIZADOR ESTIMULANTE", "Aumenta a cadência de tiro dos aliados.", Tecla.C, brimstone);

            brimstone.setHabilidades(List.of(brimstoneX, brimstoneQ, brimstoneE, brimstoneC));
            agenteRepository.save(brimstone);

            // 7. Killjoy
            Agente killjoy = new Agente();
            killjoy.setName("Killjoy");
            killjoy.setFuncao("Sentinela");
            killjoy.setNacionalidade("Alemã");

            Habilidades killjoyX = new Habilidades("CONFINAMENTO", "Atordoa inimigos em uma grande área.", Tecla.X, killjoy);
            Habilidades killjoyC = new Habilidades("ROBÔ DE ALARME", "Robô que persegue os inimigos que entram no alcance.", Tecla.C, killjoy);
            Habilidades killjoyE = new Habilidades("TORRETA", "Instala uma torreta que dispara em inimigos.", Tecla.E, killjoy);
            Habilidades killjoyQ = new Habilidades("NANOENXAME", "Uma granada Nanoenxame, que aciona um enxame de nanorrobôs que causam dano.", Tecla.Q, killjoy);

            killjoy.setHabilidades(List.of(killjoyX, killjoyC, killjoyE, killjoyQ));
            agenteRepository.save(killjoy);

            // 8. Viper

            Agente viper = new Agente();
            viper.setName("Viper");
            viper.setFuncao("Controladora");
            viper.setNacionalidade("Norte-Americana");

            Habilidades viperX = new Habilidades("POÇO PEÇONHENTO","EQUIPE um borrifador químico. DISPARE para borrifar uma nuvem química em todas as direções ao redor de Viper, criando uma grande nuvem que reduz o alcance de visão e a Vida máxima dos jogadores dentro dela.",Tecla.X,viper);
            Habilidades viperC = new Habilidades("NUVEM VENENOSA","EQUIPE um emissor de gás. DISPARE para jogar o emissor, que persiste até o fim da rodada.",Tecla.C, viper);
            Habilidades viperE = new Habilidades("CORTINA TÓXICA","EQUIPE um lançador de emissores de gás. DISPARE para lançar uma longa linha de emissores de gás. ", Tecla.E, viper);
            Habilidades viperQ = new Habilidades("VENENO DE COBRA","EQUIPE um lançador químico. DISPARE para lançar um cilindro que se rompe ao atingir o chão, gerando uma zona química duradoura que causa dano e reduz a velocidade dos inimigos.",Tecla.Q,viper);

            viper.setHabilidades(List.of(viperX, viperC, viperE, viperQ));
            agenteRepository.save(viper);

            // 9. Cypher

            Agente cypher = new Agente();
            cypher.setName("Cypher");
            cypher.setFuncao("Sentinela");
            cypher.setNacionalidade("Marroquino");

            Habilidades cypherX = new Habilidades("ASSALTO NEURAL","Use INSTANTANEAMENTE num jogador inimigo morto na sua mira para revelar a localização de todos os jogadores inimigos ainda vivos.",Tecla.X,cypher);
            Habilidades cypherC = new Habilidades("FIO-ARMADILHA","EQUIPE um fio-armadilha. DISPARE para instalar um fio acionador oculto e destrutível no local-alvo, criando uma linha entre o local e a parede oposta.", Tecla.C,cypher);
            Habilidades cypherE = new Habilidades("CÂMERA DE VIGILÂNCIA","EQUIPE uma Câmera de Vigilância. DISPARE para colocar a câmera no local-alvo. REPITA a habilidade para controlar a visão da câmera.",Tecla.E,cypher);
            Habilidades cypherQ = new Habilidades("JAULA CIBERNÉTICA","INSTANTANEAMENTE joga a jaula cibernética diante de Cypher.", Tecla.Q,cypher);

            cypher.setHabilidades(List.of(cypherX,cypherC,cypherE,cypherQ));
            agenteRepository.save(cypher);

            // 10. Breach

            Agente breach = new Agente();
            breach.setName("Breach");
            breach.setFuncao("Iniciador");
            breach.setNacionalidade("Sueco");

            Habilidades breachX = new Habilidades("ONDA TROVEJANTE","EQUIPE uma carga sísmica. Dispare para lançar um terremoto em cascata por todo o terreno num grande cone. O terremoto estonteia e derruba todos que estiverem na área de efeito.", Tecla.X, breach);
            Habilidades breachC = new Habilidades("PÓS-CHOQUE","EQUIPE uma carga de fusão. DISPARE a carga para armar um jato de ação lenta pela parede. O jato causa muito dano a todos que estiverem na área de efeito.",Tecla.C,breach);
            Habilidades breachE = new Habilidades("FALHA TECTÔNICA","EQUIPE um impacto sísmico. SEGURE O DISPARO para aumentar a distância. SOLTE para iniciar o terremoto, estonteando todos os jogadores na zona e numa linha reta até a zona.",Tecla.E,breach);
            Habilidades breachQ = new Habilidades("ESTOPIM", "EQUIPE uma carga cegante. DISPARE a carga para armar um jato de ação rápida pela parede. A carga é detonada, cegando todos os jogadores que estiverem olhando para ela.",Tecla.Q,breach);

            breach.setHabilidades(List.of(breachX,breachC,breachE,breachQ));
            agenteRepository.save(breach);

            // MAPAS

            Mapa bind = new Mapa();
            bind.setNome("Bind");
            bind.setDescricao("Dois pontos. Nenhuma área no meio. Você precisa escolher: direita ou esquerda? E aí, qual vai ser? Ambos os lados oferecem caminhos diretos para os atacantes, e dois teleportadores de sentido único facilitam o flanqueamento.");
            mapaRepository.save(bind);

            Mapa haven = new Mapa();
            haven.setNome("Haven");
            haven.setDescricao(" Neste mapa, há mais áreas para controlar. Em compensação, os defensores também conseguem aproveitar o território extra para coordenar investidas mais agressivas.");
            mapaRepository.save(haven);

            Mapa ascent = new Mapa();
            ascent.setNome("Ascent");
            ascent.setDescricao(" Cada uma pode ser fortificada por portas explosivas irreversíveis que, quando derrubadas, forçam as equipes a destruí-las ou a acharem outra maneira de prosseguir.");
            mapaRepository.save(ascent);

            Mapa sunset = new Mapa();
            sunset.setNome("Sunset");
            sunset.setDescricao("Um desastre em uma instalação da Kingdom ameaça engolir toda a vizinhança.Dê um pulo no seu food truck favorito e depois lute por toda a cidade neste mapa três rotas.");
            mapaRepository.save(sunset);

            Mapa lotus = new Mapa();
            lotus.setNome("Lotus");
            lotus.setDescricao("Uma estrutura misteriosa com um conduíte astral irradia poder ancestral. Grandes portas de pedra oferecem várias oportunidades de movimentação e revelam caminhos para três locais enigmáticos.");
            mapaRepository.save(lotus);

            Mapa pearl = new Mapa();
            pearl.setNome("Pearl");
            pearl.setDescricao("Pearl é um mapa sem mecânicas focado no ambiente. Encare a batalha em um Meio compacto ou em áreas mais alongadas no nosso primeiro mapa situado na Terra Ômega.");
            mapaRepository.save(lotus);

            Mapa fracture = new Mapa();
            fracture.setNome("Fracture");
            fracture.setDescricao("Um local de pesquisas altamente confidencial partido ao meio por um experimento com Radianita malsucedido. Com opções tão divididas quanto o próprio mapa para os defensores, a escolha é sua: encare os atacantes na própria base deles ou prepare o terreno para um ataque iminente.");
            mapaRepository.save(fracture);

            Mapa breeze = new Mapa();
            breeze.setNome("Breeze");
            breeze.setDescricao("Conheça as ruínas históricas ou visite as grutas deste paraíso tropical. Mas é bom se cobrir, pois temos espaços muito abertos e embates de longa distância. Cuide dos seus flancos e você poderá curtir a brisa do Breeze.");
            mapaRepository.save(breeze);

            Mapa icebox = new Mapa();
            icebox.setNome("Icebox");
            icebox.setDescricao("Você precisará ter cuidado com os terrenos horizontais dos dois pontos principais, que são protegidos por neve e metal. Aproveite para usar as tirolesas, e seus inimigos nunca verão seu ataque iminente.");
            mapaRepository.save(icebox);

            Mapa split = new Mapa();
            split.setNome("Split");
            split.setDescricao("Cada ponto tem uma torre imponente que é vital para o controle da área. E não se esqueça: mantenha os olhos abertos e focados nas áreas elevadas antes que tudo vá pelos ares.");
            mapaRepository.save(split);


        }
    }
}
