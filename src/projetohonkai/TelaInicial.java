package projetohonkai;

import Classes.Cone;
import Classes.Personagem;
import Classes.Reliquia;
import Conexao.Conexao;
import Usuario.LoginU;
import Usuario.Usuario;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class TelaInicial extends javax.swing.JFrame {
    
    
    ConeJF cjf = new ConeJF();
    OrnamentoJF ojf = new OrnamentoJF();
    Personagem p = new Personagem();
    Reliquia r = new Reliquia();
    Cone c = new Cone();
    String sql;
    int i;
    Usuario u = new Usuario();
    
    public TelaInicial(int id) {
        InserirValores();
        u = Usuario.ListaTI.get(id);
        initComponents();
    }

    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TelaInicialTI = new javax.swing.JPanel();
        PastaTI = new javax.swing.JTabbedPane();
        PersonagensTI = new javax.swing.JPanel();
        BArgentiTI = new javax.swing.JButton();
        ArgentiTxtTI = new javax.swing.JLabel();
        BBailuTI = new javax.swing.JButton();
        BailuTxtTI = new javax.swing.JLabel();
        BBladeTI = new javax.swing.JButton();
        BladeTxtTI = new javax.swing.JLabel();
        BBronyaTI = new javax.swing.JButton();
        BronyaTxtTI = new javax.swing.JLabel();
        BClaraTI = new javax.swing.JButton();
        ClaraTxtTI = new javax.swing.JLabel();
        BLunaeTI = new javax.swing.JButton();
        LunaeTxtTI = new javax.swing.JLabel();
        BFuXuanTI = new javax.swing.JButton();
        FuXuanTxtTI = new javax.swing.JLabel();
        BGepardTI = new javax.swing.JButton();
        GepardTxtTI = new javax.swing.JLabel();
        BHimekoTI = new javax.swing.JButton();
        HimekoTxtTI = new javax.swing.JLabel();
        BHuohuoTI = new javax.swing.JButton();
        HuohuoTxtTI = new javax.swing.JLabel();
        BJingYuanTI = new javax.swing.JButton();
        JingYuanTxtTI = new javax.swing.JLabel();
        BJingliuTI = new javax.swing.JButton();
        JingliuTxtTI = new javax.swing.JLabel();
        BKafkaTI = new javax.swing.JButton();
        KafkaTxtTI = new javax.swing.JLabel();
        BLuochaTI = new javax.swing.JButton();
        LuochaTxtTI = new javax.swing.JLabel();
        BSeeleTI = new javax.swing.JButton();
        SeeleTxtTI = new javax.swing.JLabel();
        BSilverWolfTI = new javax.swing.JButton();
        SilverWolfTxtTI = new javax.swing.JLabel();
        BTopazTI = new javax.swing.JButton();
        TopazTxtTI = new javax.swing.JLabel();
        BTrailblazerFTI = new javax.swing.JButton();
        TrailblazerFTxtTI = new javax.swing.JLabel();
        BTrailblazerPTI = new javax.swing.JButton();
        TrailblazerPTxtTI = new javax.swing.JLabel();
        BWeltTI = new javax.swing.JButton();
        WeltTxtTI = new javax.swing.JLabel();
        BYanqingTI = new javax.swing.JButton();
        YanqingTxtTI = new javax.swing.JLabel();
        BArlanTI = new javax.swing.JButton();
        ArlanTxtTI = new javax.swing.JLabel();
        BAstaTI = new javax.swing.JButton();
        AstaTxtTI = new javax.swing.JLabel();
        BHengTI = new javax.swing.JButton();
        HengTxtTI = new javax.swing.JLabel();
        BGuinaifenTI = new javax.swing.JButton();
        GuinaifenTxtTI = new javax.swing.JLabel();
        BHanyaTI = new javax.swing.JButton();
        HanyaTxtTI = new javax.swing.JLabel();
        BHertaTI = new javax.swing.JButton();
        HertaTxtTI = new javax.swing.JLabel();
        BHookTI = new javax.swing.JButton();
        HookTxtTI = new javax.swing.JLabel();
        BLukaTI = new javax.swing.JButton();
        LukaTxtTI = new javax.swing.JLabel();
        BLynxTI = new javax.swing.JButton();
        LynxTxtTI = new javax.swing.JLabel();
        BMarchTI = new javax.swing.JButton();
        MarchTxtTI = new javax.swing.JLabel();
        BNatashaTI = new javax.swing.JButton();
        NatashaTxtTI = new javax.swing.JLabel();
        BPelaTI = new javax.swing.JButton();
        PelaTxtTI = new javax.swing.JLabel();
        BQingqueTI = new javax.swing.JButton();
        QingqueTxtTI = new javax.swing.JLabel();
        BSampoTI = new javax.swing.JButton();
        SampoTxtTI = new javax.swing.JLabel();
        BServalTI = new javax.swing.JButton();
        ServalTxtTI = new javax.swing.JLabel();
        BSushangTI = new javax.swing.JButton();
        SushangTxtTI = new javax.swing.JLabel();
        BTingyunTI = new javax.swing.JButton();
        TingyunTxtTI = new javax.swing.JLabel();
        BYukongTI = new javax.swing.JButton();
        YukongTxtTI = new javax.swing.JLabel();
        ConesTI = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        DestruicaoTI = new javax.swing.JPanel();
        JLTitulo5TID = new javax.swing.JLabel();
        BAlgoInsubstituivelTI = new javax.swing.JButton();
        JLAlgoInsubstituivelTI = new javax.swing.JLabel();
        BEuSereiMinhaPropriaEspadaTI = new javax.swing.JButton();
        JLEuSereiMinhaTI = new javax.swing.JLabel();
        JLPropriaEspadaTI = new javax.swing.JLabel();
        BMaisClaroDoQueOSolTI = new javax.swing.JButton();
        JLMaisClaroDoQueTI = new javax.swing.JLabel();
        JLOSolTI = new javax.swing.JLabel();
        BNaQuedaDeUmAeonTI = new javax.swing.JButton();
        JLNaQuedaDeUmTI = new javax.swing.JLabel();
        JLAeonTI = new javax.swing.JLabel();
        BOLadoInacessivelTI = new javax.swing.JButton();
        JLOLadoInacessivelTI = new javax.swing.JLabel();
        JLTitulo4TID = new javax.swing.JLabel();
        BAsToupeirasTeDaoBoasVindasTI = new javax.swing.JButton();
        JLAsToupeirasTeDaoTI = new javax.swing.JLabel();
        JLBoasVindasTI = new javax.swing.JLabel();
        BAuHoraDePassearTI = new javax.swing.JButton();
        JLAuHoraDeTI = new javax.swing.JLabel();
        JLPassearTI = new javax.swing.JLabel();
        BSemEscapatoriaTI = new javax.swing.JButton();
        JLSemEscapatoriaTI = new javax.swing.JLabel();
        BSobOCeuAzulTI = new javax.swing.JButton();
        JLSobOCeuAzulTI = new javax.swing.JLabel();
        BUmVotoSecretoTI = new javax.swing.JButton();
        JLUmVotoSecretoTI = new javax.swing.JLabel();
        JLTitulo3TID = new javax.swing.JLabel();
        BCasaDestruidaTI = new javax.swing.JButton();
        JLCasaDestruidaTI = new javax.swing.JLabel();
        BCeuColapsadoTI = new javax.swing.JButton();
        JLCeuColapsadoTI = new javax.swing.JLabel();
        BMorteMutuaTI = new javax.swing.JButton();
        JLMorteMutuaTI = new javax.swing.JLabel();
        CacaTI = new javax.swing.JPanel();
        JLTitulo5TIC = new javax.swing.JLabel();
        BInquietanteExtasianteTI = new javax.swing.JButton();
        JLIquietanteTI = new javax.swing.JLabel();
        JLExtasianteTI = new javax.swing.JLabel();
        BNaNoiteTI = new javax.swing.JButton();
        JLNaNoiteTI = new javax.swing.JLabel();
        BPercorrendoOMarEstelarTI = new javax.swing.JButton();
        JLPercorrendoOMarTI = new javax.swing.JLabel();
        JLEstelarTI = new javax.swing.JLabel();
        BSonoProfundoTI = new javax.swing.JButton();
        JLSonoProfundoTI = new javax.swing.JLabel();
        JLTitulo4TIC = new javax.swing.JLabel();
        BApenasOSilencioSobrouTI = new javax.swing.JButton();
        JLApenasOSilencioTI = new javax.swing.JLabel();
        JLSobrouTI = new javax.swing.JLabel();
        BInscrevaSeParaMaisTI = new javax.swing.JButton();
        JLInscrevaSeParaTI = new javax.swing.JLabel();
        JLMaisTI = new javax.swing.JLabel();
        BJogoDeEspadasTI = new javax.swing.JButton();
        JLJogoDeEspadasTI = new javax.swing.JLabel();
        BORioCorreNaPrimaveraTI = new javax.swing.JButton();
        JLORioCorreNaTI = new javax.swing.JLabel();
        JLPrimaveraTI = new javax.swing.JLabel();
        BRetornoAEscuridaoTI = new javax.swing.JButton();
        JLRetornoAEscuridaoTI = new javax.swing.JLabel();
        JLTitulo3TIC = new javax.swing.JLabel();
        BAntagonistaTI = new javax.swing.JButton();
        JLAntagonistaTI = new javax.swing.JLabel();
        BFlechaVelozTI = new javax.swing.JButton();
        JLFlechaVelozTI = new javax.swing.JLabel();
        BFlechasTI = new javax.swing.JButton();
        JLFlechasTI = new javax.swing.JLabel();
        ErudicaoTI = new javax.swing.JPanel();
        JLTitulo5TIE = new javax.swing.JLabel();
        BAntesDoAmanhecerTI = new javax.swing.JButton();
        JLAntesDoAmanhecerTI = new javax.swing.JLabel();
        BNoiteNaViaLacteaTI = new javax.swing.JButton();
        JLNoiteNaViaTI = new javax.swing.JLabel();
        JLLacteaTI = new javax.swing.JLabel();
        BUmInstanteEternamenteAdoradoTI = new javax.swing.JButton();
        JLUmInstanteTI = new javax.swing.JLabel();
        JLEternamenteAdoradoTI = new javax.swing.JLabel();
        JLTitulo4TIE = new javax.swing.JLabel();
        BASolenidadeDoCafeDaManhaTI = new javax.swing.JButton();
        JLASolenidadeDoTI = new javax.swing.JLabel();
        JLCafeDaManhaTI = new javax.swing.JLabel();
        BFacaOMundoClamarTI = new javax.swing.JButton();
        JLFacaOMundoTI = new javax.swing.JLabel();
        JLClamarTI = new javax.swing.JLabel();
        BHojeEMaisUmDiaDePazTI = new javax.swing.JButton();
        JLHojeEMaisUmTI = new javax.swing.JLabel();
        JLDiaDePazTI = new javax.swing.JLabel();
        BMeuProprioNascimentoTI = new javax.swing.JButton();
        JLMeuProprioTI = new javax.swing.JLabel();
        JLNascimentoTI = new javax.swing.JLabel();
        BRepousoDosGeniosTI = new javax.swing.JButton();
        JLRepousoDosGeniosTI = new javax.swing.JLabel();
        JLTitulo3TIE = new javax.swing.JLabel();
        BBancoDeDadosTI = new javax.swing.JButton();
        JLBancoDeDadosTI = new javax.swing.JLabel();
        BChaveMestraTI = new javax.swing.JButton();
        JLChaveMestraTI = new javax.swing.JLabel();
        BSagacidadeTI = new javax.swing.JButton();
        JLSagacidadeTI = new javax.swing.JLabel();
        HarmoniaTI = new javax.swing.JPanel();
        JLTitulo5TIH = new javax.swing.JLabel();
        BMasABatalhaNaoAcabouTI = new javax.swing.JButton();
        JLMasABatalhaNaoTI = new javax.swing.JLabel();
        JLAcabouTI = new javax.swing.JLabel();
        BMeuPassadoNoEspelhoTI = new javax.swing.JButton();
        JLMeuPassadoNoTI = new javax.swing.JLabel();
        JLEspelhoTI = new javax.swing.JLabel();
        JLTitulo4TIH = new javax.swing.JLabel();
        BDanceDanceDanceTI = new javax.swing.JButton();
        JLDanceDanceTI = new javax.swing.JLabel();
        JLDanceTI = new javax.swing.JLabel();
        BEncontroPlanetarioTI = new javax.swing.JButton();
        JLEncontroPlanetarioTI = new javax.swing.JLabel();
        BEsculpindoALuaTecendoAsNuvensTI = new javax.swing.JButton();
        JLEsculpindoALuaTI = new javax.swing.JLabel();
        JLTecendoAsNuvensTI = new javax.swing.JLabel();
        BMemoriasDoPassadoTI = new javax.swing.JButton();
        JLMemoriasDoPassadoTI = new javax.swing.JLabel();
        BPassadoEFuturoTI = new javax.swing.JButton();
        JLPassadoETI = new javax.swing.JLabel();
        JLFuturoTI = new javax.swing.JLabel();
        JLTitulo3TIH = new javax.swing.JLabel();
        BMeditacaoTI = new javax.swing.JButton();
        JLMeditacaoTI = new javax.swing.JLabel();
        BRedeDeEngrenagensTI = new javax.swing.JButton();
        JLRedeDeTI = new javax.swing.JLabel();
        JLEngrenagensTI = new javax.swing.JLabel();
        BRefraoTI = new javax.swing.JButton();
        JLRefraoTI = new javax.swing.JLabel();
        InexistenciaTI = new javax.swing.JPanel();
        JLTitulo5TII = new javax.swing.JLabel();
        BChuvaConstanteTI = new javax.swing.JButton();
        JLChuvaConstanteTI = new javax.swing.JLabel();
        BCuraSolitariaTI = new javax.swing.JButton();
        JLCuraSolitariaTI = new javax.swing.JLabel();
        BEmNomeDoMundoTI = new javax.swing.JButton();
        JLEmNomeDoMundoTI = new javax.swing.JLabel();
        BVoceSoPrecisaDePacienciaTI = new javax.swing.JButton();
        JLVoceSoPrecisaTI = new javax.swing.JLabel();
        JLDePacienciaTI = new javax.swing.JLabel();
        JLTitulo4TII = new javax.swing.JLabel();
        BADeterminacaoBrilhaComoGotasDeSuorTI = new javax.swing.JButton();
        JLADeterminacaoTI = new javax.swing.JLabel();
        JLBrilhaComoGotasDeTI = new javax.swing.JLabel();
        JLSuorTI = new javax.swing.JLabel();
        BAindaNosVeremosDeNovoTI = new javax.swing.JButton();
        JLAindaNosVeremosTI = new javax.swing.JLabel();
        JLDeNovoTI = new javax.swing.JLabel();
        BAntesDoInicioDaMissaoDoTutorialTI = new javax.swing.JButton();
        JLAntesDoInicioTI = new javax.swing.JLabel();
        JLDaMissaoDoTI = new javax.swing.JLabel();
        JLTutorialTI = new javax.swing.JLabel();
        BBoaNoiteEDurmaBemTI = new javax.swing.JButton();
        JLBoaNoiteETI = new javax.swing.JLabel();
        JLDurmaBemTI = new javax.swing.JLabel();
        BFermataTI = new javax.swing.JButton();
        JLFermataTI = new javax.swing.JLabel();
        BOlhosDaPresaTI = new javax.swing.JButton();
        JLOlhosDaPresaTI = new javax.swing.JLabel();
        JLTitulo3TII = new javax.swing.JLabel();
        BLoopTI = new javax.swing.JButton();
        JLLoopTI = new javax.swing.JLabel();
        BSombraOcultaTI = new javax.swing.JButton();
        JLSombraOcultaTI = new javax.swing.JLabel();
        BVazioTI = new javax.swing.JButton();
        JLVazioTI = new javax.swing.JLabel();
        PreservacaoTI = new javax.swing.JPanel();
        JLTitulo5TIP = new javax.swing.JLabel();
        BElaJaFechouSeusOlhosTI = new javax.swing.JButton();
        JLElaJaFechouTI = new javax.swing.JLabel();
        JLSeusOlhosTI = new javax.swing.JLabel();
        BMomentoDeVitoriaTI = new javax.swing.JButton();
        JLMomentoDeVitoriaTI = new javax.swing.JLabel();
        BTexturaDeMemoriasTI = new javax.swing.JButton();
        JLTexturaDeTI = new javax.swing.JLabel();
        JLMemoriasTI = new javax.swing.JLabel();
        JLTitulo4TIP = new javax.swing.JLabel();
        BAEscolhaDosLandauTI = new javax.swing.JButton();
        JLAEscolhaDosTI = new javax.swing.JLabel();
        JLLandauTI = new javax.swing.JLabel();
        BEssaSouEuTI = new javax.swing.JButton();
        JLEssaSouEuTI = new javax.swing.JLabel();
        BPrimeiroDiaDaMinhaVidaNovaTI = new javax.swing.JButton();
        JLPrimeiroDiaDaTI = new javax.swing.JLabel();
        JLMinhaNovaVidaTI = new javax.swing.JLabel();
        BSomosFogoVivoTI = new javax.swing.JButton();
        JLSomosFogoVivoTI = new javax.swing.JLabel();
        BTendenciaDoMercadoUniversalTI = new javax.swing.JButton();
        JLTendenciaDoTI = new javax.swing.JLabel();
        JLMercadoUniversalTI = new javax.swing.JLabel();
        JLTitulo3TIP = new javax.swing.JLabel();
        BAmbarTI = new javax.swing.JButton();
        JLAmbarTI = new javax.swing.JLabel();
        BDefesaTI = new javax.swing.JButton();
        JLDefesaTI = new javax.swing.JLabel();
        BPioneirismoTI = new javax.swing.JButton();
        JLPioneirismoTI = new javax.swing.JLabel();
        AbundanciaTI = new javax.swing.JPanel();
        JLTitulo5TIA = new javax.swing.JLabel();
        BEcosDoCaixaoTI = new javax.swing.JButton();
        JLEcosDoCaixaoTI = new javax.swing.JLabel();
        BNoiteAterrorizanteTI = new javax.swing.JButton();
        JLNoiteAterrorizanteTI = new javax.swing.JLabel();
        BOTempoNaoEsperaPorNinguemTI = new javax.swing.JButton();
        JLOTempoNaoTI = new javax.swing.JLabel();
        JLEsperaPorNinguemTI = new javax.swing.JLabel();
        JLTitulo4TIA = new javax.swing.JLabel();
        BConversaPosOperatoriaTI = new javax.swing.JButton();
        JLConversaTI = new javax.swing.JLabel();
        JLPosOperatoriaTI = new javax.swing.JLabel();
        BEiEstouAquiTI = new javax.swing.JButton();
        JLEiEstouAquiTI = new javax.swing.JLabel();
        BMomentoPerfeitoTI = new javax.swing.JButton();
        JLMomentoPerfeitoTI = new javax.swing.JLabel();
        BOCalorEncurtaAsNoitesGeladasTI = new javax.swing.JButton();
        JLOCalorEncurtaTI = new javax.swing.JLabel();
        JLAsNOitesGeladasTI = new javax.swing.JLabel();
        BQuidProQuoTI = new javax.swing.JButton();
        JLQuidProQuoTI = new javax.swing.JLabel();
        BSentimentoCompartilhadoTI = new javax.swing.JButton();
        JLSentimentoTI = new javax.swing.JLabel();
        JLCompartilhadoTI = new javax.swing.JLabel();
        JLTitulo3TIA = new javax.swing.JLabel();
        BCornucopiaTI = new javax.swing.JButton();
        JLCornucopiaTI = new javax.swing.JLabel();
        BFrutaDelicadaTI = new javax.swing.JButton();
        JLFrutaDelicadaTI = new javax.swing.JLabel();
        BMultiplicacaoTI = new javax.swing.JButton();
        JLMultiplicacaoTI = new javax.swing.JLabel();
        ReliquiasTI = new javax.swing.JPanel();
        BAguiaTI = new javax.swing.JButton();
        JLAguiaDaLinhaTI = new javax.swing.JLabel();
        JLDoCrepusculoTI = new javax.swing.JLabel();
        BAndarilhoTI = new javax.swing.JButton();
        JLAndarilhoDoDesertoTI = new javax.swing.JLabel();
        JLDaBandidagemTI = new javax.swing.JLabel();
        BArtesaoTI = new javax.swing.JButton();
        JLArtesaoDoFogoTI = new javax.swing.JLabel();
        JLDaForjaDeLavaTI = new javax.swing.JLabel();
        BBandaTI = new javax.swing.JButton();
        JLBandaTrovaoTI = new javax.swing.JLabel();
        JLCrepitanteTI = new javax.swing.JLabel();
        BCacadorTI = new javax.swing.JButton();
        JLCacadorDaTI = new javax.swing.JLabel();
        JLFlorestaGlacialTI = new javax.swing.JLabel();
        BCampeaTI = new javax.swing.JButton();
        JLCampeaDoBoxeTI = new javax.swing.JLabel();
        JLDeRuaTI = new javax.swing.JLabel();
        BCavaleiraTI = new javax.swing.JButton();
        JLCavaleiraDoTI = new javax.swing.JLabel();
        JLPalacioDaPurezaTI = new javax.swing.JLabel();
        BDicipulaTI = new javax.swing.JButton();
        JLDicipulaLongevaTI = new javax.swing.JLabel();
        BGenioTI = new javax.swing.JButton();
        JLGenioDasTI = new javax.swing.JLabel();
        JLEstrelasBrilhantesTI = new javax.swing.JLabel();
        BGraoDuqueTI = new javax.swing.JButton();
        JLGraoDuqueEmTI = new javax.swing.JLabel();
        BGuardaTI = new javax.swing.JButton();
        JLGuardaDaNeveTI = new javax.swing.JLabel();
        BLadraoTI = new javax.swing.JButton();
        JLLadraoDaChuvaTI = new javax.swing.JLabel();
        BMensageiraTI = new javax.swing.JButton();
        JLMensageiraTI = new javax.swing.JLabel();
        BMosqueteiraTI = new javax.swing.JButton();
        JLMosqueteiraDoTI = new javax.swing.JLabel();
        JLTrigoSelvagemTI = new javax.swing.JLabel();
        BPrisioneiroTI = new javax.swing.JButton();
        JLPrisioneiroEmTI = new javax.swing.JLabel();
        JLConfinamentoTI = new javax.swing.JLabel();
        JLProfundoTI = new javax.swing.JLabel();
        BTranseunteTI = new javax.swing.JButton();
        JLTranseunteDaTI = new javax.swing.JLabel();
        JLNuvemErranteTI = new javax.swing.JLabel();
        JLChamasTI = new javax.swing.JLabel();
        JLUivanteTI = new javax.swing.JLabel();
        JLDeMeteorosTI = new javax.swing.JLabel();
        JLAtravessandoOTI = new javax.swing.JLabel();
        JLHackerspaceTI = new javax.swing.JLabel();
        OrnamentosTI = new javax.swing.JPanel();
        BArenaTI = new javax.swing.JButton();
        JLArenaRutilanteTI = new javax.swing.JLabel();
        BBelobogTI = new javax.swing.JButton();
        JLBelobogDosArquitetosTI = new javax.swing.JLabel();
        BDiferenciadorTI = new javax.swing.JButton();
        JLDiferenciadorCelestialTI = new javax.swing.JLabel();
        BEmpresaMercantilTI = new javax.swing.JButton();
        JLEmpresaMercantilPanCosmicaTI = new javax.swing.JLabel();
        BEstacaoTI = new javax.swing.JButton();
        JLEstacaoDeVedacaoEspacialTI = new javax.swing.JLabel();
        BFrotaTI = new javax.swing.JButton();
        JLFrotaDosEternosTI = new javax.swing.JLabel();
        BGlamothTI = new javax.swing.JButton();
        JLLinhaDeFrenteTI = new javax.swing.JLabel();
        JLFirmamentoDeGlamothTI = new javax.swing.JLabel();
        BPenaconyTI = new javax.swing.JButton();
        JLPenaconyTerraDosSonhosTI = new javax.swing.JLabel();
        BQuilhaTI = new javax.swing.JButton();
        JLQuilhaQuebradaTI = new javax.swing.JLabel();
        BSalsottoTI = new javax.swing.JButton();
        JLSalsottoInertteTI = new javax.swing.JLabel();
        BTaliaTI = new javax.swing.JButton();
        JLTaliaReinoDoBanditismoTI = new javax.swing.JLabel();
        BVonwacqTI = new javax.swing.JButton();
        JLVonwacqVivazTI = new javax.swing.JLabel();
        TLTI = new javax.swing.JPanel();
        TierSTL = new javax.swing.JPanel();
        VermelhoTL = new javax.swing.JPanel();
        TxtSTL = new javax.swing.JLabel();
        BFuXuanTL = new javax.swing.JButton();
        BSilverWolfTL = new javax.swing.JButton();
        BLunaeTL = new javax.swing.JButton();
        BBronyaTL = new javax.swing.JButton();
        BJingliuTL = new javax.swing.JButton();
        BHuohuoTL = new javax.swing.JButton();
        BSeeleTL = new javax.swing.JButton();
        BTingyunTL = new javax.swing.JButton();
        TierATL = new javax.swing.JPanel();
        LaranjaTL = new javax.swing.JPanel();
        TxtATL = new javax.swing.JLabel();
        BLuochaTL = new javax.swing.JButton();
        BBladeTL = new javax.swing.JButton();
        BGepardTL = new javax.swing.JButton();
        BArgentiTL = new javax.swing.JButton();
        BPelaTL = new javax.swing.JButton();
        BKafkaTL = new javax.swing.JButton();
        BTopazTL = new javax.swing.JButton();
        BBailuTL = new javax.swing.JButton();
        TierBTL = new javax.swing.JPanel();
        AmareloTL = new javax.swing.JPanel();
        TxtBTl = new javax.swing.JLabel();
        BWeltTL = new javax.swing.JButton();
        BJingYuanTL = new javax.swing.JButton();
        BClaraTL = new javax.swing.JButton();
        BLynxTL = new javax.swing.JButton();
        BHanyaTL = new javax.swing.JButton();
        BAstaTL = new javax.swing.JButton();
        BQingqueTL = new javax.swing.JButton();
        BTrailblazerFTL = new javax.swing.JButton();
        TierCTL = new javax.swing.JPanel();
        LimaTL = new javax.swing.JPanel();
        TxtCTL = new javax.swing.JLabel();
        BNatashaTL = new javax.swing.JButton();
        BYanqingTL = new javax.swing.JButton();
        BYukongTL = new javax.swing.JButton();
        BHimekoTL = new javax.swing.JButton();
        BSushangTL = new javax.swing.JButton();
        BGuinaifenTL = new javax.swing.JButton();
        BMarchTL = new javax.swing.JButton();
        BHengTL = new javax.swing.JButton();
        TierDTL = new javax.swing.JPanel();
        VerdeTL = new javax.swing.JPanel();
        TxtDTL = new javax.swing.JLabel();
        BLukaTL = new javax.swing.JButton();
        BSampoTL = new javax.swing.JButton();
        BHookTL = new javax.swing.JButton();
        BServalTL = new javax.swing.JButton();
        BTrailblazerPTL = new javax.swing.JButton();
        BArlanTL = new javax.swing.JButton();
        BHertaTL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaInicialTI.setBackground(new java.awt.Color(153, 153, 255));

        PastaTI.setBackground(new java.awt.Color(102, 102, 255));

        PersonagensTI.setBackground(new java.awt.Color(204, 204, 255));

        BArgentiTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Argenti.jpg")); // NOI18N
        BArgentiTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BArgentiTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArgentiTIActionPerformed(evt);
            }
        });

        ArgentiTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArgentiTxtTI.setText("Argenti");

        BBailuTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Bailu.jpg")); // NOI18N
        BBailuTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBailuTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBailuTIActionPerformed(evt);
            }
        });

        BailuTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BailuTxtTI.setText("Bailu");

        BBladeTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Blade.jpg")); // NOI18N
        BBladeTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBladeTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBladeTIActionPerformed(evt);
            }
        });

        BladeTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BladeTxtTI.setText("Blade");

        BBronyaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Bronya.jpg")); // NOI18N
        BBronyaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBronyaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBronyaTIActionPerformed(evt);
            }
        });

        BronyaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BronyaTxtTI.setText("Bronya");

        BClaraTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Clara.jpg")); // NOI18N
        BClaraTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BClaraTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClaraTIActionPerformed(evt);
            }
        });

        ClaraTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ClaraTxtTI.setText("Clara");

        BLunaeTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\DanHeng.png")); // NOI18N
        BLunaeTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLunaeTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLunaeTIActionPerformed(evt);
            }
        });

        LunaeTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LunaeTxtTI.setText("Dan Lunae");

        BFuXuanTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\FuXuan.png")); // NOI18N
        BFuXuanTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFuXuanTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFuXuanTIActionPerformed(evt);
            }
        });

        FuXuanTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        FuXuanTxtTI.setText("Fu Xuan");

        BGepardTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Gepard.jpg")); // NOI18N
        BGepardTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGepardTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGepardTIActionPerformed(evt);
            }
        });

        GepardTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GepardTxtTI.setText("Gepard");

        BHimekoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Himeko.jpg")); // NOI18N
        BHimekoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHimekoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHimekoTIActionPerformed(evt);
            }
        });

        HimekoTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HimekoTxtTI.setText("Himeko");

        BHuohuoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Huohuo.jpg")); // NOI18N
        BHuohuoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHuohuoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHuohuoTIActionPerformed(evt);
            }
        });

        HuohuoTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HuohuoTxtTI.setText("Huohuo");

        BJingYuanTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\JingYuan.png")); // NOI18N
        BJingYuanTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BJingYuanTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJingYuanTIActionPerformed(evt);
            }
        });

        JingYuanTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JingYuanTxtTI.setText("Jing Yuan");

        BJingliuTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Jingliu.jpg")); // NOI18N
        BJingliuTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BJingliuTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJingliuTIActionPerformed(evt);
            }
        });

        JingliuTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        JingliuTxtTI.setText("Jingliu");

        BKafkaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Kafka.jpg")); // NOI18N
        BKafkaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BKafkaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKafkaTIActionPerformed(evt);
            }
        });

        KafkaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        KafkaTxtTI.setText("Kafka");

        BLuochaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Luocha.jpg")); // NOI18N
        BLuochaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLuochaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLuochaTIActionPerformed(evt);
            }
        });

        LuochaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LuochaTxtTI.setText("Luocha");

        BSeeleTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Seele.jpg")); // NOI18N
        BSeeleTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSeeleTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSeeleTIActionPerformed(evt);
            }
        });

        SeeleTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SeeleTxtTI.setText("Seele");

        BSilverWolfTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\SilverWolf.jpg")); // NOI18N
        BSilverWolfTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSilverWolfTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSilverWolfTIActionPerformed(evt);
            }
        });

        SilverWolfTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SilverWolfTxtTI.setText("Silver Wolf");

        BTopazTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Topaz.jpg")); // NOI18N
        BTopazTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTopazTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTopazTIActionPerformed(evt);
            }
        });

        TopazTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TopazTxtTI.setText("Topaz");

        BTrailblazerFTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\TrailBlazerF.jpg")); // NOI18N
        BTrailblazerFTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTrailblazerFTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrailblazerFTIActionPerformed(evt);
            }
        });

        TrailblazerFTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TrailblazerFTxtTI.setText("Trailblazer");

        BTrailblazerPTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\TrailBlazerP.jpg")); // NOI18N
        BTrailblazerPTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTrailblazerPTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrailblazerPTIActionPerformed(evt);
            }
        });

        TrailblazerPTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TrailblazerPTxtTI.setText("Trailblazer");

        BWeltTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Welt.jpg")); // NOI18N
        BWeltTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BWeltTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWeltTIActionPerformed(evt);
            }
        });

        WeltTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        WeltTxtTI.setText("Welt");

        BYanqingTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Yanqing.jpg")); // NOI18N
        BYanqingTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BYanqingTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYanqingTIActionPerformed(evt);
            }
        });

        YanqingTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        YanqingTxtTI.setText("Yanqing");

        BArlanTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Arlan.jpg")); // NOI18N
        BArlanTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BArlanTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArlanTIActionPerformed(evt);
            }
        });

        ArlanTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ArlanTxtTI.setText("Arlan");

        BAstaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Asta.jpg")); // NOI18N
        BAstaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAstaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAstaTIActionPerformed(evt);
            }
        });

        AstaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        AstaTxtTI.setText("Asta");

        BHengTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\DanHeng.jpg")); // NOI18N
        BHengTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHengTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHengTIActionPerformed(evt);
            }
        });

        HengTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HengTxtTI.setText("Dan Heng");

        BGuinaifenTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Guinaifen.jpg")); // NOI18N
        BGuinaifenTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGuinaifenTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuinaifenTIActionPerformed(evt);
            }
        });

        GuinaifenTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        GuinaifenTxtTI.setText("Guinaifen");

        BHanyaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Hanya.jpg")); // NOI18N
        BHanyaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHanyaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHanyaTIActionPerformed(evt);
            }
        });

        HanyaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HanyaTxtTI.setText("Hanya");

        BHertaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Herta.jpg")); // NOI18N
        BHertaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHertaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHertaTIActionPerformed(evt);
            }
        });

        HertaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HertaTxtTI.setText("Herta");

        BHookTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Hook.jpg")); // NOI18N
        BHookTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHookTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHookTIActionPerformed(evt);
            }
        });

        HookTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        HookTxtTI.setText("Hook");

        BLukaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Luka.jpeg")); // NOI18N
        BLukaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLukaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLukaTIActionPerformed(evt);
            }
        });

        LukaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LukaTxtTI.setText("Luka");

        BLynxTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Lynx.jpg")); // NOI18N
        BLynxTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLynxTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLynxTIActionPerformed(evt);
            }
        });

        LynxTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        LynxTxtTI.setText("Lynx");

        BMarchTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\March7th.jpeg")); // NOI18N
        BMarchTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMarchTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMarchTIActionPerformed(evt);
            }
        });

        MarchTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MarchTxtTI.setText("March 7th");

        BNatashaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Natasha.jpg")); // NOI18N
        BNatashaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BNatashaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNatashaTIActionPerformed(evt);
            }
        });

        NatashaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        NatashaTxtTI.setText("Natasha");

        BPelaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Pela.jpg")); // NOI18N
        BPelaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPelaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPelaTIActionPerformed(evt);
            }
        });

        PelaTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        PelaTxtTI.setText("Pela");

        BQingqueTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Qingque.jpg")); // NOI18N
        BQingqueTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BQingqueTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQingqueTIActionPerformed(evt);
            }
        });

        QingqueTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        QingqueTxtTI.setText("Qingque");

        BSampoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Sampo.jpg")); // NOI18N
        BSampoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSampoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSampoTIActionPerformed(evt);
            }
        });

        SampoTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SampoTxtTI.setText("Sampo");

        BServalTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Serval.jpg")); // NOI18N
        BServalTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BServalTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BServalTIActionPerformed(evt);
            }
        });

        ServalTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        ServalTxtTI.setText("Serval");

        BSushangTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Sushang.jpg")); // NOI18N
        BSushangTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSushangTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSushangTIActionPerformed(evt);
            }
        });

        SushangTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        SushangTxtTI.setText("Sushang");

        BTingyunTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Tingyun.jpg")); // NOI18N
        BTingyunTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTingyunTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTingyunTIActionPerformed(evt);
            }
        });

        TingyunTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        TingyunTxtTI.setText("Tingyun");

        BYukongTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Yukong.jpg")); // NOI18N
        BYukongTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BYukongTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYukongTIActionPerformed(evt);
            }
        });

        YukongTxtTI.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        YukongTxtTI.setText("Yukong");

        javax.swing.GroupLayout PersonagensTILayout = new javax.swing.GroupLayout(PersonagensTI);
        PersonagensTI.setLayout(PersonagensTILayout);
        PersonagensTILayout.setHorizontalGroup(
            PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonagensTILayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PersonagensTILayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(MarchTxtTI)
                        .addGap(76, 76, 76)
                        .addComponent(NatashaTxtTI)
                        .addGap(133, 133, 133)
                        .addComponent(PelaTxtTI)
                        .addGap(101, 101, 101)
                        .addComponent(QingqueTxtTI)
                        .addGap(100, 100, 100)
                        .addComponent(SampoTxtTI)
                        .addContainerGap())
                    .addGroup(PersonagensTILayout.createSequentialGroup()
                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JingYuanTxtTI))
                            .addComponent(BYanqingTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BMarchTI)
                            .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BArgentiTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BJingYuanTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(BJingliuTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(BBailuTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(BArlanTI, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(BNatashaTI))
                                .addGap(67, 67, 67)
                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BKafkaTI)
                                            .addComponent(BBladeTI))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BBronyaTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(BLuochaTI, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createSequentialGroup()
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(BPelaTI)
                                            .addComponent(BAstaTI)
                                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                                .addGap(24, 24, 24)
                                                .addComponent(AstaTxtTI)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(HengTxtTI))
                                            .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(BHengTI, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(BQingqueTI, javax.swing.GroupLayout.Alignment.TRAILING)))))
                                .addGap(68, 68, 68)
                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(BClaraTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(BSeeleTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(GuinaifenTxtTI))
                                            .addComponent(BGuinaifenTI)))
                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(BSampoTI)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE))
                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(JingliuTxtTI)
                                .addGap(129, 129, 129)
                                .addComponent(KafkaTxtTI)
                                .addGap(110, 110, 110)
                                .addComponent(LuochaTxtTI)
                                .addGap(113, 113, 113)
                                .addComponent(SeeleTxtTI)
                                .addGap(76, 76, 76)))
                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BServalTI)
                                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BSilverWolfTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BLunaeTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BHanyaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(LunaeTxtTI))
                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(ServalTxtTI)))
                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(FuXuanTxtTI)
                                        .addGap(111, 111, 111)
                                        .addComponent(GepardTxtTI)
                                        .addGap(86, 86, 86)
                                        .addComponent(HimekoTxtTI)
                                        .addContainerGap())
                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(BHertaTI)
                                                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(BTopazTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(BFuXuanTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PersonagensTILayout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(SushangTxtTI))
                                                        .addComponent(BSushangTI))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(TopazTxtTI)
                                                .addGap(32, 32, 32)))
                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                            .addComponent(BTrailblazerFTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                            .addComponent(BGepardTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addComponent(BHookTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(PersonagensTILayout.createSequentialGroup()
                                                            .addGap(6, 6, 6)
                                                            .addComponent(TrailblazerFTxtTI)))
                                                    .addComponent(BTingyunTI))
                                                .addGap(18, 47, Short.MAX_VALUE)
                                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createSequentialGroup()
                                                        .addComponent(TrailblazerPTxtTI)
                                                        .addGap(88, 88, 88)
                                                        .addComponent(WeltTxtTI)
                                                        .addGap(53, 53, 53))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createSequentialGroup()
                                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(PersonagensTILayout.createSequentialGroup()
                                                                        .addComponent(BLukaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createSequentialGroup()
                                                                        .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                            .addComponent(BHimekoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                            .addComponent(BTrailblazerPTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGap(51, 51, 51)))
                                                                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(BHuohuoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addComponent(BLynxTI)
                                                                    .addComponent(BWeltTI)))
                                                            .addComponent(BYukongTI))
                                                        .addGap(18, 18, 18))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PersonagensTILayout.createSequentialGroup()
                                                .addComponent(TingyunTxtTI)
                                                .addGap(84, 84, 84)
                                                .addComponent(YukongTxtTI)
                                                .addGap(193, 193, 193))))))
                            .addGroup(PersonagensTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(SilverWolfTxtTI)
                                .addContainerGap())))
                    .addGroup(PersonagensTILayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(YanqingTxtTI)
                        .addGap(93, 93, 93)
                        .addComponent(ArlanTxtTI)
                        .addGap(624, 624, 624)
                        .addComponent(HanyaTxtTI)
                        .addGap(125, 125, 125)
                        .addComponent(HertaTxtTI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HookTxtTI)
                        .addGap(104, 104, 104)
                        .addComponent(LukaTxtTI)
                        .addGap(110, 110, 110)
                        .addComponent(LynxTxtTI)
                        .addGap(58, 58, 58))
                    .addGroup(PersonagensTILayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(ArgentiTxtTI)
                        .addGap(100, 100, 100)
                        .addComponent(BailuTxtTI)
                        .addGap(130, 130, 130)
                        .addComponent(BladeTxtTI)
                        .addGap(106, 106, 106)
                        .addComponent(BronyaTxtTI)
                        .addGap(121, 121, 121)
                        .addComponent(ClaraTxtTI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(HuohuoTxtTI)
                        .addGap(47, 47, 47))))
        );
        PersonagensTILayout.setVerticalGroup(
            PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PersonagensTILayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BBailuTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBladeTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BBronyaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BClaraTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLunaeTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BFuXuanTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BGepardTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHimekoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHuohuoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BArgentiTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ArgentiTxtTI)
                    .addComponent(BailuTxtTI)
                    .addComponent(ClaraTxtTI)
                    .addComponent(BronyaTxtTI)
                    .addComponent(BladeTxtTI)
                    .addComponent(FuXuanTxtTI)
                    .addComponent(LunaeTxtTI)
                    .addComponent(GepardTxtTI)
                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(HuohuoTxtTI)
                        .addComponent(HimekoTxtTI)))
                .addGap(18, 18, 18)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BJingliuTI)
                    .addComponent(BJingYuanTI)
                    .addComponent(BKafkaTI)
                    .addComponent(BLuochaTI)
                    .addComponent(BSeeleTI)
                    .addComponent(BSilverWolfTI)
                    .addComponent(BTopazTI)
                    .addComponent(BTrailblazerFTI)
                    .addComponent(BTrailblazerPTI)
                    .addComponent(BWeltTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TrailblazerPTxtTI)
                    .addComponent(WeltTxtTI)
                    .addComponent(TrailblazerFTxtTI)
                    .addComponent(TopazTxtTI)
                    .addComponent(SilverWolfTxtTI)
                    .addComponent(SeeleTxtTI)
                    .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(LuochaTxtTI)
                        .addComponent(KafkaTxtTI))
                    .addComponent(JingliuTxtTI)
                    .addComponent(JingYuanTxtTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BAstaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHengTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BArlanTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BYanqingTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BGuinaifenTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHanyaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHertaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHookTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLukaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLynxTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(YanqingTxtTI)
                    .addComponent(ArlanTxtTI)
                    .addComponent(AstaTxtTI)
                    .addComponent(HengTxtTI)
                    .addComponent(GuinaifenTxtTI)
                    .addComponent(HanyaTxtTI)
                    .addComponent(HertaTxtTI)
                    .addComponent(HookTxtTI)
                    .addComponent(LukaTxtTI)
                    .addComponent(LynxTxtTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BQingqueTI)
                    .addComponent(BSampoTI)
                    .addComponent(BPelaTI)
                    .addComponent(BNatashaTI)
                    .addComponent(BMarchTI)
                    .addComponent(BSushangTI)
                    .addComponent(BTingyunTI)
                    .addComponent(BYukongTI)
                    .addComponent(BServalTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PersonagensTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MarchTxtTI)
                    .addComponent(NatashaTxtTI)
                    .addComponent(PelaTxtTI)
                    .addComponent(QingqueTxtTI)
                    .addComponent(SampoTxtTI)
                    .addComponent(ServalTxtTI)
                    .addComponent(SushangTxtTI)
                    .addComponent(TingyunTxtTI)
                    .addComponent(YukongTxtTI))
                .addGap(0, 48, Short.MAX_VALUE))
        );

        PastaTI.addTab("Personagens", PersonagensTI);

        ConesTI.setBackground(new java.awt.Color(204, 204, 255));

        jTabbedPane1.setBackground(new java.awt.Color(102, 102, 255));

        DestruicaoTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TID.setText("Cones 5 Estrelas:");

        BAlgoInsubstituivelTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Algo Insubstituível.png")); // NOI18N
        BAlgoInsubstituivelTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAlgoInsubstituivelTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAlgoInsubstituivelTIActionPerformed(evt);
            }
        });

        JLAlgoInsubstituivelTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAlgoInsubstituivelTI.setText("Algo Insubstituível");

        BEuSereiMinhaPropriaEspadaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Eu Serei Minha Própria Espada.png")); // NOI18N
        BEuSereiMinhaPropriaEspadaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEuSereiMinhaPropriaEspadaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEuSereiMinhaPropriaEspadaTIActionPerformed(evt);
            }
        });

        JLEuSereiMinhaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEuSereiMinhaTI.setText("Eu Serei Minha ");

        JLPropriaEspadaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPropriaEspadaTI.setText("Própria Espada");

        BMaisClaroDoQueOSolTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Mais Claro do que o Sol.png")); // NOI18N
        BMaisClaroDoQueOSolTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMaisClaroDoQueOSolTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMaisClaroDoQueOSolTIActionPerformed(evt);
            }
        });

        JLMaisClaroDoQueTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMaisClaroDoQueTI.setText("Mais Claro do que");

        JLOSolTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLOSolTI.setText("o Sol");

        BNaQuedaDeUmAeonTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Na Queda de Um Aeon.png")); // NOI18N
        BNaQuedaDeUmAeonTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BNaQuedaDeUmAeonTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNaQuedaDeUmAeonTIActionPerformed(evt);
            }
        });

        JLNaQuedaDeUmTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLNaQuedaDeUmTI.setText("Na Queda de um");

        JLAeonTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAeonTI.setText("Aeon");

        BOLadoInacessivelTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\O Lado Inacessível.png")); // NOI18N
        BOLadoInacessivelTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOLadoInacessivelTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOLadoInacessivelTIActionPerformed(evt);
            }
        });

        JLOLadoInacessivelTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLOLadoInacessivelTI.setText("O Lado Inacessível");

        JLTitulo4TID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TID.setText("Cones 4 Estrelas:");

        BAsToupeirasTeDaoBoasVindasTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\As Toupeiras Te Dão Boas-vindas.png")); // NOI18N
        BAsToupeirasTeDaoBoasVindasTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAsToupeirasTeDaoBoasVindasTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAsToupeirasTeDaoBoasVindasTIActionPerformed(evt);
            }
        });

        JLAsToupeirasTeDaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAsToupeirasTeDaoTI.setText("As Toupeiras Te Dão");

        JLBoasVindasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLBoasVindasTI.setText("Boas-Vindas");

        BAuHoraDePassearTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Au! Hora de Passear.png")); // NOI18N
        BAuHoraDePassearTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAuHoraDePassearTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAuHoraDePassearTIActionPerformed(evt);
            }
        });

        JLAuHoraDeTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAuHoraDeTI.setText("Au! Hora de");

        JLPassearTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPassearTI.setText("Passear");

        BSemEscapatoriaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Sem Escapatória.png")); // NOI18N
        BSemEscapatoriaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSemEscapatoriaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSemEscapatoriaTIActionPerformed(evt);
            }
        });

        JLSemEscapatoriaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSemEscapatoriaTI.setText("Sem Escapatória");

        BSobOCeuAzulTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Sob o Céu Azul.png")); // NOI18N
        BSobOCeuAzulTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSobOCeuAzulTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSobOCeuAzulTIActionPerformed(evt);
            }
        });

        JLSobOCeuAzulTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSobOCeuAzulTI.setText("Sob o Céu Azul");

        BUmVotoSecretoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Um Voto Secreto.png")); // NOI18N
        BUmVotoSecretoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUmVotoSecretoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUmVotoSecretoTIActionPerformed(evt);
            }
        });

        JLUmVotoSecretoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLUmVotoSecretoTI.setText("Um Voto Secreto");

        JLTitulo3TID.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TID.setText("Cones 3 Estrelas:");

        BCasaDestruidaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Casa Destruída.png")); // NOI18N
        BCasaDestruidaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCasaDestruidaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCasaDestruidaTIActionPerformed(evt);
            }
        });

        JLCasaDestruidaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCasaDestruidaTI.setText("Casa Destruída");

        BCeuColapsadoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Céu Colapsado.png")); // NOI18N
        BCeuColapsadoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCeuColapsadoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCeuColapsadoTIActionPerformed(evt);
            }
        });

        JLCeuColapsadoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCeuColapsadoTI.setText("Céu Colapsado");

        BMorteMutuaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Destruição\\Morte Mútua.png")); // NOI18N
        BMorteMutuaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMorteMutuaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMorteMutuaTIActionPerformed(evt);
            }
        });

        JLMorteMutuaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMorteMutuaTI.setText("Morte Mútua");

        javax.swing.GroupLayout DestruicaoTILayout = new javax.swing.GroupLayout(DestruicaoTI);
        DestruicaoTI.setLayout(DestruicaoTILayout);
        DestruicaoTILayout.setHorizontalGroup(
            DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DestruicaoTILayout.createSequentialGroup()
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(BAlgoInsubstituivelTI, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BEuSereiMinhaPropriaEspadaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BMaisClaroDoQueOSolTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLCasaDestruidaTI)
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLTitulo4TID)
                                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                                .addComponent(BCasaDestruidaTI)
                                                .addGap(18, 18, 18)
                                                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(BCeuColapsadoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(JLCeuColapsadoTI)))
                                            .addComponent(JLTitulo3TID))
                                        .addGap(18, 18, 18)
                                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(JLMorteMutuaTI))
                                            .addComponent(BMorteMutuaTI)))
                                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                                        .addComponent(BAsToupeirasTeDaoBoasVindasTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BAuHoraDePassearTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLSemEscapatoriaTI)
                                            .addComponent(BSemEscapatoriaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(BNaQuedaDeUmAeonTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BOLadoInacessivelTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DestruicaoTILayout.createSequentialGroup()
                                                    .addComponent(JLAeonTI)
                                                    .addGap(54, 54, 54))
                                                .addGroup(DestruicaoTILayout.createSequentialGroup()
                                                    .addComponent(BSobOCeuAzulTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(18, 18, 18)))
                                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                                .addComponent(JLSobOCeuAzulTI)
                                                .addGap(26, 26, 26)))
                                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLUmVotoSecretoTI)
                                            .addComponent(BUmVotoSecretoTI)))))
                            .addComponent(JLTitulo5TID)))
                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(JLAsToupeirasTeDaoTI))
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(JLBoasVindasTI)))
                        .addGap(18, 18, 18)
                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLAuHoraDeTI)
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(JLPassearTI))))
                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(JLAlgoInsubstituivelTI)
                        .addGap(18, 18, 18)
                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addComponent(JLPropriaEspadaTI)
                                .addGap(61, 61, 61)
                                .addComponent(JLOSolTI))
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addComponent(JLEuSereiMinhaTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLMaisClaroDoQueTI)
                                .addGap(12, 12, 12)
                                .addComponent(JLNaQuedaDeUmTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLOLadoInacessivelTI)))))
                .addContainerGap(973, Short.MAX_VALUE))
        );
        DestruicaoTILayout.setVerticalGroup(
            DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DestruicaoTILayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(JLTitulo5TID)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BOLadoInacessivelTI)
                            .addGroup(DestruicaoTILayout.createSequentialGroup()
                                .addComponent(BNaQuedaDeUmAeonTI)
                                .addGap(1, 1, 1))
                            .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BMaisClaroDoQueOSolTI)
                                .addComponent(BEuSereiMinhaPropriaEspadaTI))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DestruicaoTILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BAlgoInsubstituivelTI, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEuSereiMinhaTI)
                    .addComponent(JLMaisClaroDoQueTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLNaQuedaDeUmTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLOLadoInacessivelTI)
                    .addComponent(JLAlgoInsubstituivelTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPropriaEspadaTI)
                    .addComponent(JLOSolTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JLAeonTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DestruicaoTILayout.createSequentialGroup()
                        .addComponent(JLTitulo4TID)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BAsToupeirasTeDaoBoasVindasTI)
                            .addComponent(BAuHoraDePassearTI)))
                    .addComponent(BSemEscapatoriaTI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BSobOCeuAzulTI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BUmVotoSecretoTI, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAuHoraDeTI)
                    .addComponent(JLSemEscapatoriaTI)
                    .addComponent(JLSobOCeuAzulTI)
                    .addComponent(JLUmVotoSecretoTI)
                    .addComponent(JLAsToupeirasTeDaoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLBoasVindasTI)
                    .addComponent(JLPassearTI))
                .addGap(33, 33, 33)
                .addComponent(JLTitulo3TID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BMorteMutuaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCasaDestruidaTI)
                    .addComponent(BCeuColapsadoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(DestruicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLCasaDestruidaTI)
                        .addComponent(JLCeuColapsadoTI))
                    .addComponent(JLMorteMutuaTI))
                .addContainerGap(160, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("A Destruição", DestruicaoTI);

        CacaTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TIC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TIC.setText("Cones 5 Estrelas:");

        BInquietanteExtasianteTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Inquietante, Extasiante.png")); // NOI18N
        BInquietanteExtasianteTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BInquietanteExtasianteTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInquietanteExtasianteTIActionPerformed(evt);
            }
        });

        JLIquietanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLIquietanteTI.setText("Inquietante, ");

        JLExtasianteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLExtasianteTI.setText("Extasiante");

        BNaNoiteTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Na Noite.png")); // NOI18N
        BNaNoiteTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BNaNoiteTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNaNoiteTIActionPerformed(evt);
            }
        });

        JLNaNoiteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLNaNoiteTI.setText("Na Noite");

        BPercorrendoOMarEstelarTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Percorrendo o Mar Estelar.png")); // NOI18N
        BPercorrendoOMarEstelarTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPercorrendoOMarEstelarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPercorrendoOMarEstelarTIActionPerformed(evt);
            }
        });

        JLPercorrendoOMarTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPercorrendoOMarTI.setText("Percorrendo o Mar");

        JLEstelarTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEstelarTI.setText("Estelar");

        BSonoProfundoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Sono Profundo.png")); // NOI18N
        BSonoProfundoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSonoProfundoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSonoProfundoTIActionPerformed(evt);
            }
        });

        JLSonoProfundoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSonoProfundoTI.setText("Sono Profundo");

        JLTitulo4TIC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TIC.setText("Cones 4 Estrelas:");

        BApenasOSilencioSobrouTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Apenas o Silêncio Sobrou.png")); // NOI18N
        BApenasOSilencioSobrouTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BApenasOSilencioSobrouTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BApenasOSilencioSobrouTIActionPerformed(evt);
            }
        });

        JLApenasOSilencioTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLApenasOSilencioTI.setText("Apenas o Silêncio");

        JLSobrouTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSobrouTI.setText("Sobrou");

        BInscrevaSeParaMaisTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Inscreva-se para Mais.png")); // NOI18N
        BInscrevaSeParaMaisTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BInscrevaSeParaMaisTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BInscrevaSeParaMaisTIActionPerformed(evt);
            }
        });

        JLInscrevaSeParaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLInscrevaSeParaTI.setText("Inscreva-se Para");

        JLMaisTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMaisTI.setText("Mais");

        BJogoDeEspadasTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Jogo de Espadas.png")); // NOI18N
        BJogoDeEspadasTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BJogoDeEspadasTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJogoDeEspadasTIActionPerformed(evt);
            }
        });

        JLJogoDeEspadasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLJogoDeEspadasTI.setText("Jogo de Espadas");

        BORioCorreNaPrimaveraTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\O Rio Corre na Primavera.png")); // NOI18N
        BORioCorreNaPrimaveraTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BORioCorreNaPrimaveraTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BORioCorreNaPrimaveraTIActionPerformed(evt);
            }
        });

        JLORioCorreNaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLORioCorreNaTI.setText("O Rio Corre na");

        JLPrimaveraTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPrimaveraTI.setText("Primavera");

        BRetornoAEscuridaoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Retorno à Escuridão.png")); // NOI18N
        BRetornoAEscuridaoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BRetornoAEscuridaoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRetornoAEscuridaoTIActionPerformed(evt);
            }
        });

        JLRetornoAEscuridaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLRetornoAEscuridaoTI.setText("Retorno à Escuridão");

        JLTitulo3TIC.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TIC.setText("Cones 3 Estrelas:");

        BAntagonistaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Antagonista.png")); // NOI18N
        BAntagonistaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAntagonistaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAntagonistaTIActionPerformed(evt);
            }
        });

        JLAntagonistaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAntagonistaTI.setText("Antagonista");

        BFlechaVelozTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Flecha Veloz.png")); // NOI18N
        BFlechaVelozTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFlechaVelozTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFlechaVelozTIActionPerformed(evt);
            }
        });

        JLFlechaVelozTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFlechaVelozTI.setText("Flecha Veloz");

        BFlechasTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Caça\\Flechas.png")); // NOI18N
        BFlechasTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFlechasTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFlechasTIActionPerformed(evt);
            }
        });

        JLFlechasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFlechasTI.setText("Flechas");

        javax.swing.GroupLayout CacaTILayout = new javax.swing.GroupLayout(CacaTI);
        CacaTI.setLayout(CacaTILayout);
        CacaTILayout.setHorizontalGroup(
            CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CacaTILayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CacaTILayout.createSequentialGroup()
                        .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLTitulo5TIC)
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addComponent(BInquietanteExtasianteTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BNaNoiteTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BPercorrendoOMarEstelarTI)))
                                .addGap(18, 18, 18)
                                .addComponent(BSonoProfundoTI))
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLExtasianteTI)
                                        .addGap(189, 189, 189)
                                        .addComponent(JLEstelarTI))
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addComponent(JLIquietanteTI)
                                        .addGap(50, 50, 50)
                                        .addComponent(JLNaNoiteTI)
                                        .addGap(43, 43, 43)
                                        .addComponent(JLPercorrendoOMarTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLSonoProfundoTI))))
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLJogoDeEspadasTI)
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addComponent(BApenasOSilencioSobrouTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BInscrevaSeParaMaisTI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BJogoDeEspadasTI)))
                                .addGap(18, 18, 18)
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BORioCorreNaPrimaveraTI)
                                    .addComponent(JLORioCorreNaTI))
                                .addGap(18, 18, 18)
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BRetornoAEscuridaoTI)
                                    .addComponent(JLRetornoAEscuridaoTI)))
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BAntagonistaTI)
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLAntagonistaTI)))
                                .addGap(17, 17, 17)
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLFlechaVelozTI)
                                        .addGap(64, 64, 64)
                                        .addComponent(JLFlechasTI))
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addComponent(BFlechaVelozTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BFlechasTI))))
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLMaisTI)
                                    .addComponent(JLTitulo3TIC))
                                .addGap(209, 209, 209)
                                .addComponent(JLPrimaveraTI)))
                        .addGap(0, 963, Short.MAX_VALUE))
                    .addGroup(CacaTILayout.createSequentialGroup()
                        .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(JLTitulo4TIC))
                            .addGroup(CacaTILayout.createSequentialGroup()
                                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLApenasOSilencioTI)
                                    .addGroup(CacaTILayout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(JLSobrouTI)))
                                .addGap(12, 12, 12)
                                .addComponent(JLInscrevaSeParaTI)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        CacaTILayout.setVerticalGroup(
            CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CacaTILayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CacaTILayout.createSequentialGroup()
                        .addComponent(JLTitulo5TIC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BInquietanteExtasianteTI)
                            .addComponent(BNaNoiteTI)
                            .addComponent(BPercorrendoOMarEstelarTI)))
                    .addComponent(BSonoProfundoTI))
                .addGap(5, 5, 5)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLIquietanteTI)
                    .addComponent(JLPercorrendoOMarTI)
                    .addComponent(JLSonoProfundoTI)
                    .addComponent(JLNaNoiteTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLExtasianteTI)
                    .addComponent(JLEstelarTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CacaTILayout.createSequentialGroup()
                        .addComponent(JLTitulo4TIC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BApenasOSilencioSobrouTI, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BInscrevaSeParaMaisTI, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CacaTILayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BJogoDeEspadasTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BORioCorreNaPrimaveraTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BRetornoAEscuridaoTI, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLApenasOSilencioTI)
                    .addComponent(JLInscrevaSeParaTI)
                    .addComponent(JLJogoDeEspadasTI)
                    .addComponent(JLORioCorreNaTI)
                    .addComponent(JLRetornoAEscuridaoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLMaisTI, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLSobrouTI)
                        .addComponent(JLPrimaveraTI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BAntagonistaTI)
                    .addGroup(CacaTILayout.createSequentialGroup()
                        .addComponent(JLTitulo3TIC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BFlechaVelozTI))
                    .addComponent(BFlechasTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(CacaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAntagonistaTI)
                    .addComponent(JLFlechaVelozTI)
                    .addComponent(JLFlechasTI))
                .addGap(250, 250, 250))
        );

        jTabbedPane1.addTab("A Caça", CacaTI);

        ErudicaoTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TIE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TIE.setText("Cones 5 Estrelas:");

        BAntesDoAmanhecerTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Antes do Amanhecer.png")); // NOI18N
        BAntesDoAmanhecerTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAntesDoAmanhecerTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAntesDoAmanhecerTIActionPerformed(evt);
            }
        });

        JLAntesDoAmanhecerTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAntesDoAmanhecerTI.setText("Antes do Amanhecer");

        BNoiteNaViaLacteaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Noite na Via Láctea.png")); // NOI18N
        BNoiteNaViaLacteaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BNoiteNaViaLacteaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNoiteNaViaLacteaTIActionPerformed(evt);
            }
        });

        JLNoiteNaViaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLNoiteNaViaTI.setText("Noite na Via");

        JLLacteaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLLacteaTI.setText("Láctea");

        BUmInstanteEternamenteAdoradoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Um Instante Eternamente Adorado.png")); // NOI18N
        BUmInstanteEternamenteAdoradoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BUmInstanteEternamenteAdoradoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BUmInstanteEternamenteAdoradoTIActionPerformed(evt);
            }
        });

        JLUmInstanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLUmInstanteTI.setText("Um Instante");

        JLEternamenteAdoradoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEternamenteAdoradoTI.setText("Eternamente Adorado");

        JLTitulo4TIE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TIE.setText("Cones 4 Estrelas:");

        BASolenidadeDoCafeDaManhaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\A Solenidade do Café da Manhã.png")); // NOI18N
        BASolenidadeDoCafeDaManhaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BASolenidadeDoCafeDaManhaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BASolenidadeDoCafeDaManhaTIActionPerformed(evt);
            }
        });

        JLASolenidadeDoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLASolenidadeDoTI.setText("A Solenidade Do");

        JLCafeDaManhaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCafeDaManhaTI.setText("Café da Manhã");

        BFacaOMundoClamarTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Faça o Mundo Clamar.png")); // NOI18N
        BFacaOMundoClamarTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFacaOMundoClamarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFacaOMundoClamarTIActionPerformed(evt);
            }
        });

        JLFacaOMundoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFacaOMundoTI.setText("Faça o Mundo");

        JLClamarTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLClamarTI.setText("Clamar");

        BHojeEMaisUmDiaDePazTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Hoje é Mais um Dia de Paz.png")); // NOI18N
        BHojeEMaisUmDiaDePazTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHojeEMaisUmDiaDePazTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHojeEMaisUmDiaDePazTIActionPerformed(evt);
            }
        });

        JLHojeEMaisUmTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLHojeEMaisUmTI.setText("Hoje é Mais um");

        JLDiaDePazTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDiaDePazTI.setText("Dia de Paz");

        BMeuProprioNascimentoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Meu Próprio Nascimento.png")); // NOI18N
        BMeuProprioNascimentoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMeuProprioNascimentoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMeuProprioNascimentoTIActionPerformed(evt);
            }
        });

        JLMeuProprioTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMeuProprioTI.setText("Meu Próprio");

        JLNascimentoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLNascimentoTI.setText("Nascimento");

        BRepousoDosGeniosTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Repouso dos Gênios.png")); // NOI18N
        BRepousoDosGeniosTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BRepousoDosGeniosTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRepousoDosGeniosTIActionPerformed(evt);
            }
        });

        JLRepousoDosGeniosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLRepousoDosGeniosTI.setText("Repouso dos Gênios");

        JLTitulo3TIE.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TIE.setText("Cones 3 Estrelas:");

        BBancoDeDadosTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Banco de Dados.png")); // NOI18N
        BBancoDeDadosTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBancoDeDadosTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBancoDeDadosTIActionPerformed(evt);
            }
        });

        JLBancoDeDadosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLBancoDeDadosTI.setText("Banco de Dados");

        BChaveMestraTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Chave Mestra.png")); // NOI18N
        BChaveMestraTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BChaveMestraTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BChaveMestraTIActionPerformed(evt);
            }
        });

        JLChaveMestraTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLChaveMestraTI.setText("Chave Mestra");

        BSagacidadeTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Erudição\\Sagacidade.png")); // NOI18N
        BSagacidadeTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSagacidadeTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSagacidadeTIActionPerformed(evt);
            }
        });

        JLSagacidadeTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSagacidadeTI.setText("Sagacidade");

        javax.swing.GroupLayout ErudicaoTILayout = new javax.swing.GroupLayout(ErudicaoTI);
        ErudicaoTI.setLayout(ErudicaoTILayout);
        ErudicaoTILayout.setHorizontalGroup(
            ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErudicaoTILayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                        .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                .addComponent(BAntesDoAmanhecerTI)
                                .addGap(18, 18, 18)
                                .addComponent(BNoiteNaViaLacteaTI)
                                .addGap(18, 18, 18)
                                .addComponent(BUmInstanteEternamenteAdoradoTI))
                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLTitulo4TIE)
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addComponent(JLAntesDoAmanhecerTI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JLNoiteNaViaTI))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ErudicaoTILayout.createSequentialGroup()
                                        .addComponent(JLLacteaTI)
                                        .addGap(21, 21, 21)))
                                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addGap(13, 13, 13)
                                        .addComponent(JLEternamenteAdoradoTI))
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(JLUmInstanteTI))))
                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLTitulo3TIE)
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addComponent(JLCafeDaManhaTI)
                                        .addGap(49, 49, 49)
                                        .addComponent(JLClamarTI)
                                        .addGap(75, 75, 75)
                                        .addComponent(JLDiaDePazTI))
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(JLBancoDeDadosTI)
                                            .addComponent(BBancoDeDadosTI))
                                        .addGap(18, 18, 18)
                                        .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                                .addComponent(BChaveMestraTI)
                                                .addGap(18, 18, 18)
                                                .addComponent(BSagacidadeTI))
                                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(JLChaveMestraTI)
                                                .addGap(46, 46, 46)
                                                .addComponent(JLSagacidadeTI))))))
                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                .addComponent(BASolenidadeDoCafeDaManhaTI)
                                .addGap(18, 18, 18)
                                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BFacaOMundoClamarTI)
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLFacaOMundoTI)))
                                .addGap(18, 18, 18)
                                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addComponent(BHojeEMaisUmDiaDePazTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BMeuProprioNascimentoTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BRepousoDosGeniosTI))
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLHojeEMaisUmTI)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                        .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLTitulo5TIE)
                            .addGroup(ErudicaoTILayout.createSequentialGroup()
                                .addComponent(JLASolenidadeDoTI)
                                .addGap(280, 280, 280)
                                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLNascimentoTI)
                                    .addGroup(ErudicaoTILayout.createSequentialGroup()
                                        .addComponent(JLMeuProprioTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLRepousoDosGeniosTI)))))
                        .addGap(0, 962, Short.MAX_VALUE))))
        );
        ErudicaoTILayout.setVerticalGroup(
            ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ErudicaoTILayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JLTitulo5TIE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BAntesDoAmanhecerTI)
                        .addComponent(BNoiteNaViaLacteaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BUmInstanteEternamenteAdoradoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAntesDoAmanhecerTI)
                    .addComponent(JLNoiteNaViaTI)
                    .addComponent(JLUmInstanteTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEternamenteAdoradoTI)
                    .addComponent(JLLacteaTI))
                .addGap(3, 3, 3)
                .addComponent(JLTitulo4TIE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ErudicaoTILayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BFacaOMundoClamarTI))
                    .addComponent(BASolenidadeDoCafeDaManhaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BMeuProprioNascimentoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BRepousoDosGeniosTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHojeEMaisUmDiaDePazTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLASolenidadeDoTI)
                    .addComponent(JLFacaOMundoTI)
                    .addComponent(JLHojeEMaisUmTI)
                    .addComponent(JLMeuProprioTI)
                    .addComponent(JLRepousoDosGeniosTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLCafeDaManhaTI)
                    .addComponent(JLClamarTI)
                    .addComponent(JLDiaDePazTI)
                    .addComponent(JLNascimentoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTitulo3TIE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BBancoDeDadosTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BChaveMestraTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BSagacidadeTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ErudicaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLChaveMestraTI)
                    .addComponent(JLSagacidadeTI)
                    .addComponent(JLBancoDeDadosTI))
                .addGap(237, 237, 237))
        );

        jTabbedPane1.addTab("A Erudição", ErudicaoTI);

        HarmoniaTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TIH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TIH.setText("Cones 5 Estrelas:");

        BMasABatalhaNaoAcabouTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Mas a Batalha Não Acabou.png")); // NOI18N
        BMasABatalhaNaoAcabouTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMasABatalhaNaoAcabouTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMasABatalhaNaoAcabouTIActionPerformed(evt);
            }
        });

        JLMasABatalhaNaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMasABatalhaNaoTI.setText("Mas a Batalha Não");

        JLAcabouTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAcabouTI.setText("Acabou");

        BMeuPassadoNoEspelhoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Meu Passado no Espelho.png")); // NOI18N
        BMeuPassadoNoEspelhoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMeuPassadoNoEspelhoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMeuPassadoNoEspelhoTIActionPerformed(evt);
            }
        });

        JLMeuPassadoNoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMeuPassadoNoTI.setText("Meu Passado no ");

        JLEspelhoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEspelhoTI.setText("Espelho");

        JLTitulo4TIH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TIH.setText("Cones 4 Estrelas:");

        BDanceDanceDanceTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Dance! Dance! Dance!.png")); // NOI18N
        BDanceDanceDanceTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BDanceDanceDanceTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDanceDanceDanceTIActionPerformed(evt);
            }
        });

        JLDanceDanceTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDanceDanceTI.setText("Dance! Dance!");

        JLDanceTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDanceTI.setText("Dance!");

        BEncontroPlanetarioTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Encontro Planetário.png")); // NOI18N
        BEncontroPlanetarioTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEncontroPlanetarioTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEncontroPlanetarioTIActionPerformed(evt);
            }
        });

        JLEncontroPlanetarioTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEncontroPlanetarioTI.setText("Encontro Planetário");

        BEsculpindoALuaTecendoAsNuvensTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Esculpindo a Lua, Tecendo as Núvens.png")); // NOI18N
        BEsculpindoALuaTecendoAsNuvensTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEsculpindoALuaTecendoAsNuvensTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEsculpindoALuaTecendoAsNuvensTIActionPerformed(evt);
            }
        });

        JLEsculpindoALuaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEsculpindoALuaTI.setText("Esculpindo a Lua");

        JLTecendoAsNuvensTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTecendoAsNuvensTI.setText("Tecendo as Nuvens");

        BMemoriasDoPassadoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Memórias do Passado.png")); // NOI18N
        BMemoriasDoPassadoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMemoriasDoPassadoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMemoriasDoPassadoTIActionPerformed(evt);
            }
        });

        JLMemoriasDoPassadoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMemoriasDoPassadoTI.setText("Memorias do Passado");

        BPassadoEFuturoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Passado e Futuro.png")); // NOI18N
        BPassadoEFuturoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPassadoEFuturoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPassadoEFuturoTIActionPerformed(evt);
            }
        });

        JLPassadoETI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPassadoETI.setText("Passado e ");

        JLFuturoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFuturoTI.setText("Futuro");

        JLTitulo3TIH.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TIH.setText("Cones 3 Estrelas:");

        BMeditacaoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Meditação.png")); // NOI18N
        BMeditacaoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMeditacaoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMeditacaoTIActionPerformed(evt);
            }
        });

        JLMeditacaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMeditacaoTI.setText("Meditação");

        BRedeDeEngrenagensTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Rede de Engrenagens.png")); // NOI18N
        BRedeDeEngrenagensTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BRedeDeEngrenagensTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRedeDeEngrenagensTIActionPerformed(evt);
            }
        });

        JLRedeDeTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLRedeDeTI.setText("Rede de ");

        JLEngrenagensTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEngrenagensTI.setText("Engrenagens");

        BRefraoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Harmonia\\Refrão.png")); // NOI18N
        BRefraoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BRefraoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRefraoTIActionPerformed(evt);
            }
        });

        JLRefraoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLRefraoTI.setText("Refrão");

        javax.swing.GroupLayout HarmoniaTILayout = new javax.swing.GroupLayout(HarmoniaTI);
        HarmoniaTI.setLayout(HarmoniaTILayout);
        HarmoniaTILayout.setHorizontalGroup(
            HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HarmoniaTILayout.createSequentialGroup()
                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(JLMeditacaoTI)
                                        .addGap(58, 58, 58)
                                        .addComponent(JLRedeDeTI))
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addComponent(BMeditacaoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLEngrenagensTI)
                                            .addComponent(BRedeDeEngrenagensTI))))
                                .addGap(18, 18, 18)
                                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BRefraoTI)
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addGap(33, 33, 33)
                                        .addComponent(JLRefraoTI))))
                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JLTitulo4TIH))
                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(JLAcabouTI)
                                .addGap(82, 82, 82)
                                .addComponent(JLEspelhoTI))
                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLDanceDanceTI))
                                    .addComponent(BDanceDanceDanceTI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLEncontroPlanetarioTI)
                                    .addComponent(BEncontroPlanetarioTI))
                                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(BEsculpindoALuaTecendoAsNuvensTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BMemoriasDoPassadoTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BPassadoEFuturoTI))
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(JLEsculpindoALuaTI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JLMemoriasDoPassadoTI)
                                        .addGap(18, 18, 18)
                                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLPassadoETI)
                                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(JLFuturoTI))))))
                            .addComponent(JLTitulo3TIH)
                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                .addComponent(JLMasABatalhaNaoTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLMeuPassadoNoTI))
                            .addGroup(HarmoniaTILayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLTitulo5TIH)
                                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                                        .addComponent(BMasABatalhaNaoAcabouTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BMeuPassadoNoEspelhoTI))))))
                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(JLDanceTI)
                        .addGap(172, 172, 172)
                        .addComponent(JLTecendoAsNuvensTI)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        HarmoniaTILayout.setVerticalGroup(
            HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HarmoniaTILayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JLTitulo5TIH)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BMasABatalhaNaoAcabouTI)
                    .addComponent(BMeuPassadoNoEspelhoTI))
                .addGap(4, 4, 4)
                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLMasABatalhaNaoTI)
                    .addComponent(JLMeuPassadoNoTI))
                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BPassadoEFuturoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(HarmoniaTILayout.createSequentialGroup()
                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLEspelhoTI)
                            .addComponent(JLAcabouTI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLTitulo4TIH)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BEncontroPlanetarioTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BDanceDanceDanceTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BEsculpindoALuaTecendoAsNuvensTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BMemoriasDoPassadoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HarmoniaTILayout.createSequentialGroup()
                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLMemoriasDoPassadoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLDanceDanceTI)
                                .addComponent(JLEncontroPlanetarioTI)
                                .addComponent(JLEsculpindoALuaTI)
                                .addComponent(JLPassadoETI)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLDanceTI)
                            .addComponent(JLTecendoAsNuvensTI)
                            .addComponent(JLFuturoTI))
                        .addGap(14, 14, 14)
                        .addComponent(JLTitulo3TIH)
                        .addGap(7, 7, 7)
                        .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BMeditacaoTI)
                            .addComponent(BRedeDeEngrenagensTI)))
                    .addComponent(BRefraoTI, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(HarmoniaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLMeditacaoTI)
                    .addComponent(JLRedeDeTI)
                    .addComponent(JLRefraoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLEngrenagensTI)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("A Harmonia", HarmoniaTI);

        InexistenciaTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TII.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TII.setText("Cones 5 Estrelas:");

        BChuvaConstanteTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Chuva Constante.png")); // NOI18N
        BChuvaConstanteTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BChuvaConstanteTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BChuvaConstanteTIActionPerformed(evt);
            }
        });

        JLChuvaConstanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLChuvaConstanteTI.setText("Chuva Constante");

        BCuraSolitariaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Cura Solitária.png")); // NOI18N
        BCuraSolitariaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCuraSolitariaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCuraSolitariaTIActionPerformed(evt);
            }
        });

        JLCuraSolitariaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCuraSolitariaTI.setText("Cura Solitária");

        BEmNomeDoMundoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Em Nome do Mundo.png")); // NOI18N
        BEmNomeDoMundoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEmNomeDoMundoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEmNomeDoMundoTIActionPerformed(evt);
            }
        });

        JLEmNomeDoMundoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEmNomeDoMundoTI.setText("Em Nome do Mundo");

        BVoceSoPrecisaDePacienciaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Você Só Precisa de Paciência.png")); // NOI18N
        BVoceSoPrecisaDePacienciaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVoceSoPrecisaDePacienciaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVoceSoPrecisaDePacienciaTIActionPerformed(evt);
            }
        });

        JLVoceSoPrecisaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLVoceSoPrecisaTI.setText("Você Só Precisa");

        JLDePacienciaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDePacienciaTI.setText("de Paciência");

        JLTitulo4TII.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TII.setText("Cones 4 Estrelas:");

        BADeterminacaoBrilhaComoGotasDeSuorTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\A Determinação Brilha Como Gotas de Suor.png")); // NOI18N
        BADeterminacaoBrilhaComoGotasDeSuorTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BADeterminacaoBrilhaComoGotasDeSuorTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BADeterminacaoBrilhaComoGotasDeSuorTIActionPerformed(evt);
            }
        });

        JLADeterminacaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLADeterminacaoTI.setText("A Determinação");

        JLBrilhaComoGotasDeTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLBrilhaComoGotasDeTI.setText("Brilha Como Gotas de");

        JLSuorTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSuorTI.setText("Suor");

        BAindaNosVeremosDeNovoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Ainda nos Veremos de Novo.png")); // NOI18N
        BAindaNosVeremosDeNovoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAindaNosVeremosDeNovoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAindaNosVeremosDeNovoTIActionPerformed(evt);
            }
        });

        JLAindaNosVeremosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAindaNosVeremosTI.setText("Ainda nos Veremos");

        JLDeNovoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDeNovoTI.setText("De Novo");

        BAntesDoInicioDaMissaoDoTutorialTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Antes do Início da Missão do Tutorial.png")); // NOI18N
        BAntesDoInicioDaMissaoDoTutorialTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAntesDoInicioDaMissaoDoTutorialTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAntesDoInicioDaMissaoDoTutorialTIActionPerformed(evt);
            }
        });

        JLAntesDoInicioTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAntesDoInicioTI.setText("Antes do Início");

        JLDaMissaoDoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDaMissaoDoTI.setText("da Missão do");

        JLTutorialTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTutorialTI.setText("Tutorial");

        BBoaNoiteEDurmaBemTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Boa Noite e Durma Bem.png")); // NOI18N
        BBoaNoiteEDurmaBemTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBoaNoiteEDurmaBemTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBoaNoiteEDurmaBemTIActionPerformed(evt);
            }
        });

        JLBoaNoiteETI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLBoaNoiteETI.setText("Boa Noite e ");

        JLDurmaBemTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDurmaBemTI.setText("Durma Bem");

        BFermataTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Fermata.png")); // NOI18N
        BFermataTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFermataTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFermataTIActionPerformed(evt);
            }
        });

        JLFermataTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFermataTI.setText("Fermata");

        BOlhosDaPresaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Olhos da Presa.png")); // NOI18N
        BOlhosDaPresaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOlhosDaPresaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOlhosDaPresaTIActionPerformed(evt);
            }
        });

        JLOlhosDaPresaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLOlhosDaPresaTI.setText("Olhos da Presa");

        JLTitulo3TII.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TII.setText("Cones 3 Estrelas:");

        BLoopTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Loop.png")); // NOI18N
        BLoopTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLoopTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLoopTIActionPerformed(evt);
            }
        });

        JLLoopTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLLoopTI.setText("Loop");

        BSombraOcultaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Sombra Oculta.png")); // NOI18N
        BSombraOcultaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSombraOcultaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSombraOcultaTIActionPerformed(evt);
            }
        });

        JLSombraOcultaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSombraOcultaTI.setText("Sombra Oculta");

        BVazioTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Inexistência\\Vazio.png")); // NOI18N
        BVazioTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVazioTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVazioTIActionPerformed(evt);
            }
        });

        JLVazioTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLVazioTI.setText("Vazio");

        javax.swing.GroupLayout InexistenciaTILayout = new javax.swing.GroupLayout(InexistenciaTI);
        InexistenciaTI.setLayout(InexistenciaTILayout);
        InexistenciaTILayout.setHorizontalGroup(
            InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InexistenciaTILayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLTitulo5TII)
                            .addComponent(JLTitulo4TII)
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BChuvaConstanteTI)
                                    .addComponent(JLChuvaConstanteTI))
                                .addGap(18, 18, 18)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(JLCuraSolitariaTI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(JLEmNomeDoMundoTI))
                                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                                        .addComponent(BCuraSolitariaTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BEmNomeDoMundoTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BVoceSoPrecisaDePacienciaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JLADeterminacaoTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(JLAindaNosVeremosTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLAntesDoInicioTI)
                                    .addComponent(JLDaMissaoDoTI))
                                .addGap(31, 31, 31)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                                        .addComponent(JLBoaNoiteETI)
                                        .addGap(52, 52, 52)
                                        .addComponent(JLFermataTI))
                                    .addComponent(JLDurmaBemTI))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                        .addComponent(BADeterminacaoBrilhaComoGotasDeSuorTI)
                        .addGap(18, 18, 18)
                        .addComponent(BAindaNosVeremosDeNovoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addGap(135, 135, 135)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLDePacienciaTI))
                                    .addComponent(JLVoceSoPrecisaTI)))
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addComponent(BAntesDoInicioDaMissaoDoTutorialTI)
                                .addGap(18, 18, 18)
                                .addComponent(BBoaNoiteEDurmaBemTI)
                                .addGap(18, 18, 18)
                                .addComponent(BFermataTI)
                                .addGap(18, 18, 18)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLOlhosDaPresaTI)
                                    .addComponent(BOlhosDaPresaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(InexistenciaTILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLBrilhaComoGotasDeTI)
                .addGap(18, 18, 18)
                .addComponent(JLDeNovoTI)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(InexistenciaTILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTitulo3TII)
                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(JLSuorTI)
                        .addGap(197, 197, 197)
                        .addComponent(JLTutorialTI))
                    .addGroup(InexistenciaTILayout.createSequentialGroup()
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BLoopTI, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(JLLoopTI)))
                        .addGap(18, 18, 18)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JLSombraOcultaTI)
                                .addGap(65, 65, 65)
                                .addComponent(JLVazioTI))
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addComponent(BSombraOcultaTI)
                                .addGap(23, 23, 23)
                                .addComponent(BVazioTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        InexistenciaTILayout.setVerticalGroup(
            InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InexistenciaTILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLTitulo5TII)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BChuvaConstanteTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BCuraSolitariaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BEmNomeDoMundoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BVoceSoPrecisaDePacienciaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLChuvaConstanteTI)
                    .addComponent(JLCuraSolitariaTI)
                    .addComponent(JLVoceSoPrecisaTI)
                    .addComponent(JLEmNomeDoMundoTI))
                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InexistenciaTILayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLDePacienciaTI)
                        .addGap(35, 35, 35)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BFermataTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BBoaNoiteEDurmaBemTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BOlhosDaPresaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLFermataTI)
                            .addComponent(JLOlhosDaPresaTI))
                        .addGap(455, 455, 455))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InexistenciaTILayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(JLTitulo4TII)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BAindaNosVeremosDeNovoTI)
                            .addComponent(BADeterminacaoBrilhaComoGotasDeSuorTI, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BAntesDoInicioDaMissaoDoTutorialTI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLADeterminacaoTI)
                            .addComponent(JLAindaNosVeremosTI)
                            .addComponent(JLAntesDoInicioTI)
                            .addComponent(JLBoaNoiteETI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLBrilhaComoGotasDeTI)
                            .addComponent(JLDeNovoTI)
                            .addComponent(JLDaMissaoDoTI)
                            .addComponent(JLDurmaBemTI))
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(InexistenciaTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLSuorTI)
                                    .addComponent(JLTutorialTI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLTitulo3TII)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BLoopTI, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BSombraOcultaTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, InexistenciaTILayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BVazioTI)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(InexistenciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLSombraOcultaTI)
                            .addComponent(JLVazioTI)
                            .addComponent(JLLoopTI))
                        .addGap(226, 226, 226))))
        );

        jTabbedPane1.addTab("A Inexistência", InexistenciaTI);

        PreservacaoTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TIP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TIP.setText("Cones 5 Estrelas:");

        BElaJaFechouSeusOlhosTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Ela Já Fechou Seus Olhos.png")); // NOI18N
        BElaJaFechouSeusOlhosTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BElaJaFechouSeusOlhosTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BElaJaFechouSeusOlhosTIActionPerformed(evt);
            }
        });

        JLElaJaFechouTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLElaJaFechouTI.setText("Ela Já Fechou");

        JLSeusOlhosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSeusOlhosTI.setText("Seus Olhos");

        BMomentoDeVitoriaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Momento de Vitória.png")); // NOI18N
        BMomentoDeVitoriaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMomentoDeVitoriaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMomentoDeVitoriaTIActionPerformed(evt);
            }
        });

        JLMomentoDeVitoriaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMomentoDeVitoriaTI.setText("Momento de Vitória");

        BTexturaDeMemoriasTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Textura de memórias.png")); // NOI18N
        BTexturaDeMemoriasTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTexturaDeMemoriasTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTexturaDeMemoriasTIActionPerformed(evt);
            }
        });

        JLTexturaDeTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTexturaDeTI.setText("Textura de");

        JLMemoriasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMemoriasTI.setText("Memórias");

        JLTitulo4TIP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TIP.setText("Cones 4 Estrelas:");

        BAEscolhaDosLandauTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\A Escolha dos Landau.png")); // NOI18N
        BAEscolhaDosLandauTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAEscolhaDosLandauTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAEscolhaDosLandauTIActionPerformed(evt);
            }
        });

        JLAEscolhaDosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAEscolhaDosTI.setText("A Escolha dos");

        JLLandauTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLLandauTI.setText("Landau");

        BEssaSouEuTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Essa Sou Eu!.png")); // NOI18N
        BEssaSouEuTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEssaSouEuTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEssaSouEuTIActionPerformed(evt);
            }
        });

        JLEssaSouEuTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEssaSouEuTI.setText("Essa Sou Eu");

        BPrimeiroDiaDaMinhaVidaNovaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Primeiro Dia da Minha Vida Nova.png")); // NOI18N
        BPrimeiroDiaDaMinhaVidaNovaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPrimeiroDiaDaMinhaVidaNovaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPrimeiroDiaDaMinhaVidaNovaTIActionPerformed(evt);
            }
        });

        JLPrimeiroDiaDaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPrimeiroDiaDaTI.setText("Primeiro Dia da");

        JLMinhaNovaVidaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMinhaNovaVidaTI.setText("Minha Nova Vida");

        BSomosFogoVivoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Somos Fogo Vivo.png")); // NOI18N
        BSomosFogoVivoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSomosFogoVivoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSomosFogoVivoTIActionPerformed(evt);
            }
        });

        JLSomosFogoVivoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSomosFogoVivoTI.setText("Somos Fogo Vivo");

        BTendenciaDoMercadoUniversalTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Tendência do Mercado Universal.png")); // NOI18N
        BTendenciaDoMercadoUniversalTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTendenciaDoMercadoUniversalTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTendenciaDoMercadoUniversalTIActionPerformed(evt);
            }
        });

        JLTendenciaDoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTendenciaDoTI.setText("Tendência do ");

        JLMercadoUniversalTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMercadoUniversalTI.setText("Mercado Universal");

        JLTitulo3TIP.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TIP.setText("Cones 3 Estrelas:");

        BAmbarTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Âmbar.png")); // NOI18N
        BAmbarTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAmbarTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAmbarTIActionPerformed(evt);
            }
        });

        JLAmbarTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAmbarTI.setText("Âmbar");

        BDefesaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Defesa.png")); // NOI18N
        BDefesaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BDefesaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDefesaTIActionPerformed(evt);
            }
        });

        JLDefesaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDefesaTI.setText("Defesa");

        BPioneirismoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Preservação\\Pioneirismo.png")); // NOI18N
        BPioneirismoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPioneirismoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPioneirismoTIActionPerformed(evt);
            }
        });

        JLPioneirismoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPioneirismoTI.setText("Pioneirismo");

        javax.swing.GroupLayout PreservacaoTILayout = new javax.swing.GroupLayout(PreservacaoTI);
        PreservacaoTI.setLayout(PreservacaoTILayout);
        PreservacaoTILayout.setHorizontalGroup(
            PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreservacaoTILayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLTitulo5TIP)
                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                        .addComponent(BElaJaFechouSeusOlhosTI, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BMomentoDeVitoriaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BTexturaDeMemoriasTI))
                    .addComponent(JLTitulo3TIP)
                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addComponent(JLElaJaFechouTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLMomentoDeVitoriaTI))
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLSeusOlhosTI)))
                                .addGap(18, 18, 18)
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(JLTexturaDeTI)
                                    .addComponent(JLMemoriasTI)))
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(JLLandauTI))
                            .addComponent(JLAEscolhaDosTI)
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addComponent(BAmbarTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BDefesaTI))
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(JLAmbarTI)
                                        .addGap(81, 81, 81)
                                        .addComponent(JLDefesaTI)))
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(BPioneirismoTI))
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(JLPioneirismoTI))))))
                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                        .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLTitulo4TIP)
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addComponent(BAEscolhaDosLandauTI, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BEssaSouEuTI)
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLEssaSouEuTI)))
                                .addGap(18, 18, 18)
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addComponent(BPrimeiroDiaDaMinhaVidaNovaTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BSomosFogoVivoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addComponent(JLPrimeiroDiaDaTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLSomosFogoVivoTI))
                                    .addComponent(JLMinhaNovaVidaTI))))
                        .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(JLMercadoUniversalTI))
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLTendenciaDoTI))
                                    .addComponent(BTendenciaDoMercadoUniversalTI, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PreservacaoTILayout.setVerticalGroup(
            PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PreservacaoTILayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(JLTitulo5TIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PreservacaoTILayout.createSequentialGroup()
                        .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BElaJaFechouSeusOlhosTI, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BMomentoDeVitoriaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLMomentoDeVitoriaTI)
                            .addComponent(JLElaJaFechouTI)
                            .addComponent(JLTexturaDeTI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PreservacaoTILayout.createSequentialGroup()
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JLSeusOlhosTI)
                                    .addComponent(JLMemoriasTI))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JLTitulo4TIP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BAEscolhaDosLandauTI, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BEssaSouEuTI)
                                    .addComponent(BPrimeiroDiaDaMinhaVidaNovaTI)))
                            .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(BTendenciaDoMercadoUniversalTI)
                                .addComponent(BSomosFogoVivoTI))))
                    .addComponent(BTexturaDeMemoriasTI, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLAEscolhaDosTI)
                    .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLEssaSouEuTI)
                        .addComponent(JLPrimeiroDiaDaTI)
                        .addComponent(JLSomosFogoVivoTI)
                        .addComponent(JLTendenciaDoTI)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLMinhaNovaVidaTI)
                    .addComponent(JLLandauTI)
                    .addComponent(JLMercadoUniversalTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTitulo3TIP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BPioneirismoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BDefesaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAmbarTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PreservacaoTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLAmbarTI)
                    .addComponent(JLDefesaTI)
                    .addComponent(JLPioneirismoTI))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("A Preservação", PreservacaoTI);

        AbundanciaTI.setBackground(new java.awt.Color(153, 153, 255));

        JLTitulo5TIA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo5TIA.setText("Cones 5 Estrelas:");

        BEcosDoCaixaoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Ecos do Caixão.png")); // NOI18N
        BEcosDoCaixaoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEcosDoCaixaoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEcosDoCaixaoTIActionPerformed(evt);
            }
        });

        JLEcosDoCaixaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEcosDoCaixaoTI.setText("Ecos do Caixão");

        BNoiteAterrorizanteTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Noite Aterrorizante.png")); // NOI18N
        BNoiteAterrorizanteTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BNoiteAterrorizanteTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNoiteAterrorizanteTIActionPerformed(evt);
            }
        });

        JLNoiteAterrorizanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLNoiteAterrorizanteTI.setText("Noite Aterrorizante");

        BOTempoNaoEsperaPorNinguemTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\O Tempo Não Espera por Ninguém.png")); // NOI18N
        BOTempoNaoEsperaPorNinguemTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOTempoNaoEsperaPorNinguemTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOTempoNaoEsperaPorNinguemTIActionPerformed(evt);
            }
        });

        JLOTempoNaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLOTempoNaoTI.setText("O Tempo Não");

        JLEsperaPorNinguemTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEsperaPorNinguemTI.setText("Espera por Ninguém");

        JLTitulo4TIA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo4TIA.setText("Cones 4 Estrelas:");

        BConversaPosOperatoriaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Conversa Pós-Operatória.png")); // NOI18N
        BConversaPosOperatoriaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BConversaPosOperatoriaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BConversaPosOperatoriaTIActionPerformed(evt);
            }
        });

        JLConversaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLConversaTI.setText("Conversa");

        JLPosOperatoriaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPosOperatoriaTI.setText(" Pós-Operatória");

        BEiEstouAquiTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Ei, Estou Aqui!.png")); // NOI18N
        BEiEstouAquiTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEiEstouAquiTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEiEstouAquiTIActionPerformed(evt);
            }
        });

        JLEiEstouAquiTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEiEstouAquiTI.setText("Ei! Estou Aqui");

        BMomentoPerfeitoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Momento Perfeito.png")); // NOI18N
        BMomentoPerfeitoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMomentoPerfeitoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMomentoPerfeitoTIActionPerformed(evt);
            }
        });

        JLMomentoPerfeitoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMomentoPerfeitoTI.setText("Momento Perfeito");

        BOCalorEncurtaAsNoitesGeladasTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\O Calor Encurta as Noites Geladas.png")); // NOI18N
        BOCalorEncurtaAsNoitesGeladasTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BOCalorEncurtaAsNoitesGeladasTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOCalorEncurtaAsNoitesGeladasTIActionPerformed(evt);
            }
        });

        JLOCalorEncurtaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLOCalorEncurtaTI.setText("O Calor Encurta");

        JLAsNOitesGeladasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAsNOitesGeladasTI.setText("as Noites Geladas");

        BQuidProQuoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Quid Pro Quo.png")); // NOI18N
        BQuidProQuoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BQuidProQuoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQuidProQuoTIActionPerformed(evt);
            }
        });

        JLQuidProQuoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLQuidProQuoTI.setText("Quid Pro Quo");

        BSentimentoCompartilhadoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Sentimento Compartilhado.png")); // NOI18N
        BSentimentoCompartilhadoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSentimentoCompartilhadoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSentimentoCompartilhadoTIActionPerformed(evt);
            }
        });

        JLSentimentoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSentimentoTI.setText("Sentimento");

        JLCompartilhadoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCompartilhadoTI.setText("Compartilhado");

        JLTitulo3TIA.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        JLTitulo3TIA.setText("Cones 3 Estrelas:");

        BCornucopiaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Cornucópia.png")); // NOI18N
        BCornucopiaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCornucopiaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCornucopiaTIActionPerformed(evt);
            }
        });

        JLCornucopiaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCornucopiaTI.setText("Cornucópia");

        BFrutaDelicadaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Fruta Delicada.png")); // NOI18N
        BFrutaDelicadaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFrutaDelicadaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFrutaDelicadaTIActionPerformed(evt);
            }
        });

        JLFrutaDelicadaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFrutaDelicadaTI.setText("Fruta Delicada");

        BMultiplicacaoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Cones\\A Abundância\\Multiplicação.png")); // NOI18N
        BMultiplicacaoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMultiplicacaoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMultiplicacaoTIActionPerformed(evt);
            }
        });

        JLMultiplicacaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMultiplicacaoTI.setText("Multiplicação");

        javax.swing.GroupLayout AbundanciaTILayout = new javax.swing.GroupLayout(AbundanciaTI);
        AbundanciaTI.setLayout(AbundanciaTILayout);
        AbundanciaTILayout.setHorizontalGroup(
            AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbundanciaTILayout.createSequentialGroup()
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                .addComponent(BEcosDoCaixaoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BNoiteAterrorizanteTI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(BOTempoNaoEsperaPorNinguemTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(JLTitulo4TIA, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(AbundanciaTILayout.createSequentialGroup()
                                    .addComponent(JLTitulo5TIA)
                                    .addGap(77, 77, 77)))
                            .addComponent(JLTitulo3TIA)
                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                .addComponent(JLEcosDoCaixaoTI)
                                .addGap(18, 18, 18)
                                .addComponent(JLNoiteAterrorizanteTI)
                                .addGap(18, 18, 18)
                                .addComponent(JLOTempoNaoTI))
                            .addComponent(JLPosOperatoriaTI)
                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BConversaPosOperatoriaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(JLConversaTI)))
                                .addGap(18, 18, 18)
                                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLEiEstouAquiTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(JLMomentoPerfeitoTI)
                                        .addGap(18, 18, 18)
                                        .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                                .addComponent(JLAsNOitesGeladasTI)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(JLCompartilhadoTI))
                                            .addComponent(JLOCalorEncurtaTI)))
                                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                                        .addComponent(BEiEstouAquiTI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(BMomentoPerfeitoTI)
                                        .addGap(18, 18, 18)
                                        .addComponent(BOCalorEncurtaAsNoitesGeladasTI, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                                .addComponent(BQuidProQuoTI)
                                                .addGap(18, 18, 18)
                                                .addComponent(BSentimentoCompartilhadoTI))
                                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(JLQuidProQuoTI)
                                                .addGap(48, 48, 48)
                                                .addComponent(JLSentimentoTI))))))
                            .addGroup(AbundanciaTILayout.createSequentialGroup()
                                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BCornucopiaTI)
                                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(JLCornucopiaTI)))
                                .addGap(18, 18, 18)
                                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BFrutaDelicadaTI)
                                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLFrutaDelicadaTI)))
                                .addGap(18, 18, 18)
                                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLMultiplicacaoTI))
                                    .addComponent(BMultiplicacaoTI)))))
                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(JLEsperaPorNinguemTI)))
                .addContainerGap(860, Short.MAX_VALUE))
        );
        AbundanciaTILayout.setVerticalGroup(
            AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AbundanciaTILayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(JLTitulo5TIA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BOTempoNaoEsperaPorNinguemTI, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BEcosDoCaixaoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BNoiteAterrorizanteTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLEcosDoCaixaoTI)
                    .addComponent(JLNoiteAterrorizanteTI)
                    .addComponent(JLOTempoNaoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLEsperaPorNinguemTI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbundanciaTILayout.createSequentialGroup()
                        .addComponent(JLTitulo4TIA)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BConversaPosOperatoriaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BEiEstouAquiTI)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BOCalorEncurtaAsNoitesGeladasTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BQuidProQuoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BMomentoPerfeitoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(BSentimentoCompartilhadoTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLConversaTI)
                    .addComponent(JLEiEstouAquiTI)
                    .addComponent(JLMomentoPerfeitoTI)
                    .addComponent(JLOCalorEncurtaTI)
                    .addComponent(JLQuidProQuoTI)
                    .addComponent(JLSentimentoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLPosOperatoriaTI)
                    .addComponent(JLAsNOitesGeladasTI)
                    .addComponent(JLCompartilhadoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLTitulo3TIA)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                        .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BCornucopiaTI)
                            .addComponent(BFrutaDelicadaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AbundanciaTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLFrutaDelicadaTI)
                            .addComponent(JLCornucopiaTI)))
                    .addGroup(AbundanciaTILayout.createSequentialGroup()
                        .addComponent(BMultiplicacaoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JLMultiplicacaoTI)))
                .addContainerGap(205, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("A Abundância", AbundanciaTI);

        javax.swing.GroupLayout ConesTILayout = new javax.swing.GroupLayout(ConesTI);
        ConesTI.setLayout(ConesTILayout);
        ConesTILayout.setHorizontalGroup(
            ConesTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConesTILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        ConesTILayout.setVerticalGroup(
            ConesTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConesTILayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 823, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        PastaTI.addTab("Cones de Luz", ConesTI);

        ReliquiasTI.setBackground(new java.awt.Color(204, 204, 255));

        BAguiaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Águia da Linha do Crepúsculo.png")); // NOI18N
        BAguiaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAguiaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAguiaTIActionPerformed(evt);
            }
        });

        JLAguiaDaLinhaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAguiaDaLinhaTI.setText("Águia da Linha");

        JLDoCrepusculoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDoCrepusculoTI.setText("do Crepúsculo");

        BAndarilhoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Andarilho do Deserdo da Bandidagem.png")); // NOI18N
        BAndarilhoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAndarilhoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAndarilhoTIActionPerformed(evt);
            }
        });

        JLAndarilhoDoDesertoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAndarilhoDoDesertoTI.setText("Andarilho do Deserto");

        JLDaBandidagemTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDaBandidagemTI.setText("da Bandidagem");

        BArtesaoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Artesão de Fogo da Forja de Lava.png")); // NOI18N
        BArtesaoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BArtesaoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArtesaoTIActionPerformed(evt);
            }
        });

        JLArtesaoDoFogoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLArtesaoDoFogoTI.setText("Artesão do Fogo");

        JLDaForjaDeLavaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDaForjaDeLavaTI.setText("da Forja de Lava");

        BBandaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Banda Trovão Crepitante.png")); // NOI18N
        BBandaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBandaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBandaTIActionPerformed(evt);
            }
        });

        JLBandaTrovaoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLBandaTrovaoTI.setText("Banda Trovão ");

        JLCrepitanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCrepitanteTI.setText("Crepitante");

        BCacadorTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Caçador da Floresta Glacial.png")); // NOI18N
        BCacadorTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCacadorTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCacadorTIActionPerformed(evt);
            }
        });

        JLCacadorDaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCacadorDaTI.setText("Caçador da");

        JLFlorestaGlacialTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFlorestaGlacialTI.setText("Floresta Glacial");

        BCampeaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Campeã de Boxe de Rua.png")); // NOI18N
        BCampeaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCampeaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCampeaTIActionPerformed(evt);
            }
        });

        JLCampeaDoBoxeTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCampeaDoBoxeTI.setText("Campeã de Boxe");

        JLDeRuaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDeRuaTI.setText("de Rua");

        BCavaleiraTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Cavaleira do Palácio da Pureza.png")); // NOI18N
        BCavaleiraTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BCavaleiraTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCavaleiraTIActionPerformed(evt);
            }
        });

        JLCavaleiraDoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLCavaleiraDoTI.setText("Cavaleira do");

        JLPalacioDaPurezaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPalacioDaPurezaTI.setText("Palácio da Pureza");

        BDicipulaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Dícipula Longeva.png")); // NOI18N
        BDicipulaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BDicipulaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDicipulaTIActionPerformed(evt);
            }
        });

        JLDicipulaLongevaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDicipulaLongevaTI.setText("Dicípula Longeva");

        BGenioTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Gênio das Estrelas Brilhantes.png")); // NOI18N
        BGenioTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGenioTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGenioTIActionPerformed(evt);
            }
        });

        JLGenioDasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLGenioDasTI.setText("Gênio das");

        JLEstrelasBrilhantesTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEstrelasBrilhantesTI.setText("Estrelas Brilhantes");

        BGraoDuqueTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Grão-Duque em Brasas.png")); // NOI18N
        BGraoDuqueTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGraoDuqueTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGraoDuqueTIActionPerformed(evt);
            }
        });

        JLGraoDuqueEmTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLGraoDuqueEmTI.setText("Grão-Duque em");

        BGuardaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Guarda da Neve Uivante.png")); // NOI18N
        BGuardaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGuardaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuardaTIActionPerformed(evt);
            }
        });

        JLGuardaDaNeveTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLGuardaDaNeveTI.setText("Guarda da Neve");

        BLadraoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Ladrão da Chuva de Meteoros.png")); // NOI18N
        BLadraoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLadraoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLadraoTIActionPerformed(evt);
            }
        });

        JLLadraoDaChuvaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLLadraoDaChuvaTI.setText("Ladrão da Chuva");

        BMensageiraTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Mensageira Atravessando o Hakerspace.png")); // NOI18N
        BMensageiraTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMensageiraTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMensageiraTIActionPerformed(evt);
            }
        });

        JLMensageiraTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMensageiraTI.setText("Menssageira ");

        BMosqueteiraTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Mosqueteira do Trigo Selvagem.png")); // NOI18N
        BMosqueteiraTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMosqueteiraTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMosqueteiraTIActionPerformed(evt);
            }
        });

        JLMosqueteiraDoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLMosqueteiraDoTI.setText("Mosqueteira do");

        JLTrigoSelvagemTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTrigoSelvagemTI.setText("Trigo Selvagem");

        BPrisioneiroTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Prisioneiro em Confinamento Profundo.png")); // NOI18N
        BPrisioneiroTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPrisioneiroTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPrisioneiroTIActionPerformed(evt);
            }
        });

        JLPrisioneiroEmTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPrisioneiroEmTI.setText("Prisioneiro em");

        JLConfinamentoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLConfinamentoTI.setText("Confinamento");

        JLProfundoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLProfundoTI.setText("Profundo");

        BTranseunteTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Atefatos\\Transeunte da Nuvem Errante.png")); // NOI18N
        BTranseunteTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTranseunteTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTranseunteTIActionPerformed(evt);
            }
        });

        JLTranseunteDaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTranseunteDaTI.setText("Transeunte da");

        JLNuvemErranteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLNuvemErranteTI.setText("Núvem Errante");

        JLChamasTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLChamasTI.setText("Chamas");

        JLUivanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLUivanteTI.setText("Uivante");

        JLDeMeteorosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDeMeteorosTI.setText("de Meteoros");

        JLAtravessandoOTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLAtravessandoOTI.setText("Atravessando o");

        JLHackerspaceTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLHackerspaceTI.setText("Hakerspace");

        javax.swing.GroupLayout ReliquiasTILayout = new javax.swing.GroupLayout(ReliquiasTI);
        ReliquiasTI.setLayout(ReliquiasTILayout);
        ReliquiasTILayout.setHorizontalGroup(
            ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReliquiasTILayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BGenioTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JLAguiaDaLinhaTI)
                                    .addComponent(JLDoCrepusculoTI)))
                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(JLGenioDasTI))
                            .addComponent(BAguiaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(JLAndarilhoDoDesertoTI))
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(84, 84, 84)
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLDaBandidagemTI)
                                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BAndarilhoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BGraoDuqueTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                .addGap(18, 18, 18)
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BGuardaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BArtesaoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(JLGuardaDaNeveTI))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReliquiasTILayout.createSequentialGroup()
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLDaForjaDeLavaTI)
                                            .addComponent(JLArtesaoDoFogoTI))
                                        .addGap(9, 9, 9))))
                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                .addGap(90, 90, 90)
                                .addComponent(JLGraoDuqueEmTI)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReliquiasTILayout.createSequentialGroup()
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(BBandaTI)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addComponent(JLCrepitanteTI)
                                        .addGap(24, 24, 24)))
                                .addGap(95, 95, 95))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ReliquiasTILayout.createSequentialGroup()
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BLadraoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(JLDeMeteorosTI))
                                            .addComponent(JLLadraoDaChuvaTI))))
                                .addGap(90, 90, 90))
                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JLBandaTrovaoTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))))
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addComponent(JLEstrelasBrilhantesTI)
                        .addGap(104, 104, 104)
                        .addComponent(JLChamasTI)
                        .addGap(168, 168, 168)
                        .addComponent(JLUivanteTI)
                        .addGap(320, 320, 320)))
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(BCacadorTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BMensageiraTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(JLCacadorDaTI))
                                    .addComponent(JLFlorestaGlacialTI)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(JLMensageiraTI)))
                                .addGap(107, 107, 107)
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BMosqueteiraTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BCampeaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(JLCampeaDoBoxeTI)
                                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(JLTrigoSelvagemTI)
                                                    .addComponent(JLMosqueteiraDoTI))))
                                        .addGap(99, 99, 99)
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BPrisioneiroTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BCavaleiraTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(ReliquiasTILayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(JLCavaleiraDoTI)
                                                    .addComponent(JLPrisioneiroEmTI)
                                                    .addComponent(JLConfinamentoTI)))))
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(JLDeRuaTI)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JLPalacioDaPurezaTI)))
                                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(88, 88, 88)
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(BTranseunteTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(BDicipulaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addComponent(JLDicipulaLongevaTI)))
                                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                                        .addGap(95, 95, 95)
                                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JLNuvemErranteTI)
                                            .addComponent(JLTranseunteDaTI)))))
                            .addComponent(JLAtravessandoOTI))
                        .addGap(30, 30, 30))
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JLHackerspaceTI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JLProfundoTI)
                        .addGap(244, 244, 244))))
        );
        ReliquiasTILayout.setVerticalGroup(
            ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ReliquiasTILayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(BCacadorTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BArtesaoTI)
                        .addComponent(BAndarilhoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BCavaleiraTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BDicipulaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BCampeaTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BAguiaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addComponent(BBandaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(JLArtesaoDoFogoTI)
                        .addComponent(JLCacadorDaTI)
                        .addComponent(JLCampeaDoBoxeTI)
                        .addComponent(JLAndarilhoDoDesertoTI)
                        .addComponent(JLAguiaDaLinhaTI)
                        .addComponent(JLCavaleiraDoTI)
                        .addComponent(JLDicipulaLongevaTI))
                    .addComponent(JLBandaTrovaoTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLDoCrepusculoTI)
                    .addComponent(JLDaBandidagemTI)
                    .addComponent(JLDaForjaDeLavaTI)
                    .addComponent(JLCrepitanteTI)
                    .addComponent(JLFlorestaGlacialTI)
                    .addComponent(JLDeRuaTI)
                    .addComponent(JLPalacioDaPurezaTI))
                .addGap(39, 39, 39)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(BMosqueteiraTI, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BMensageiraTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BGuardaTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(BGraoDuqueTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BGenioTI, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(BPrisioneiroTI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(BTranseunteTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLGraoDuqueEmTI)
                                .addComponent(JLGenioDasTI))
                            .addComponent(JLGuardaDaNeveTI)
                            .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLMosqueteiraDoTI)
                                .addComponent(JLPrisioneiroEmTI)
                                .addComponent(JLTranseunteDaTI))))
                    .addGroup(ReliquiasTILayout.createSequentialGroup()
                        .addComponent(BLadraoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JLLadraoDaChuvaTI)
                            .addComponent(JLMensageiraTI))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLEstrelasBrilhantesTI)
                    .addComponent(JLChamasTI)
                    .addComponent(JLUivanteTI)
                    .addComponent(JLDeMeteorosTI)
                    .addComponent(JLAtravessandoOTI)
                    .addComponent(JLTrigoSelvagemTI)
                    .addComponent(JLConfinamentoTI)
                    .addComponent(JLNuvemErranteTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ReliquiasTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLHackerspaceTI)
                    .addComponent(JLProfundoTI))
                .addContainerGap(435, Short.MAX_VALUE))
        );

        PastaTI.addTab("Relíquias", ReliquiasTI);

        OrnamentosTI.setBackground(new java.awt.Color(204, 204, 255));

        BArenaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Arena Rutilante.png")); // NOI18N
        BArenaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BArenaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArenaTIActionPerformed(evt);
            }
        });

        JLArenaRutilanteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLArenaRutilanteTI.setText("Arena Rutilante");

        BBelobogTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Belobog dos Arquitetos.png")); // NOI18N
        BBelobogTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBelobogTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBelobogTIActionPerformed(evt);
            }
        });

        JLBelobogDosArquitetosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLBelobogDosArquitetosTI.setText("Belobog dos Arquitetos");

        BDiferenciadorTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Diferenciador Celestial.png")); // NOI18N
        BDiferenciadorTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BDiferenciadorTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDiferenciadorTIActionPerformed(evt);
            }
        });

        JLDiferenciadorCelestialTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLDiferenciadorCelestialTI.setText("Diferenciador Celestial");

        BEmpresaMercantilTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Empresa Mercantil Pan-Cósmica.png")); // NOI18N
        BEmpresaMercantilTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEmpresaMercantilTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEmpresaMercantilTIActionPerformed(evt);
            }
        });

        JLEmpresaMercantilPanCosmicaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEmpresaMercantilPanCosmicaTI.setText("Empresa Mercantil Pan-Cósmica");

        BEstacaoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Estação de Vedação Espacial.png")); // NOI18N
        BEstacaoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BEstacaoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEstacaoTIActionPerformed(evt);
            }
        });

        JLEstacaoDeVedacaoEspacialTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLEstacaoDeVedacaoEspacialTI.setText("Estação de Vedação Espacial");

        BFrotaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Frota dos Eternos.png")); // NOI18N
        BFrotaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFrotaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFrotaTIActionPerformed(evt);
            }
        });

        JLFrotaDosEternosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFrotaDosEternosTI.setText("Frota dos Eternos");

        BGlamothTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Linha de Frente Firmamento de Glamoth.png")); // NOI18N
        BGlamothTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGlamothTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGlamothTIActionPerformed(evt);
            }
        });

        JLLinhaDeFrenteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLLinhaDeFrenteTI.setText("Linha de Frente: ");

        JLFirmamentoDeGlamothTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLFirmamentoDeGlamothTI.setText("Firmamento de Glamoth");

        BPenaconyTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Penacony, Terra dos Sonhos.png")); // NOI18N
        BPenaconyTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPenaconyTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPenaconyTIActionPerformed(evt);
            }
        });

        JLPenaconyTerraDosSonhosTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLPenaconyTerraDosSonhosTI.setText("Penacony, Terra dos Sonhos");

        BQuilhaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Quilha Quebrada.png")); // NOI18N
        BQuilhaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BQuilhaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQuilhaTIActionPerformed(evt);
            }
        });

        JLQuilhaQuebradaTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLQuilhaQuebradaTI.setText("Quilha Quebrada");

        BSalsottoTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Salsotto Inerte.png")); // NOI18N
        BSalsottoTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSalsottoTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSalsottoTIActionPerformed(evt);
            }
        });

        JLSalsottoInertteTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLSalsottoInertteTI.setText("Salsotto Inerte");

        BTaliaTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Talia Reino do Banditismo.png")); // NOI18N
        BTaliaTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTaliaTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTaliaTIActionPerformed(evt);
            }
        });

        JLTaliaReinoDoBanditismoTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLTaliaReinoDoBanditismoTI.setText("Talia: Reino do Banditismo");

        BVonwacqTI.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Ornamentos\\Vonwacq Vivaz.png")); // NOI18N
        BVonwacqTI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BVonwacqTI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BVonwacqTIActionPerformed(evt);
            }
        });

        JLVonwacqVivazTI.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JLVonwacqVivazTI.setText("Vonwacq Vivaz");

        javax.swing.GroupLayout OrnamentosTILayout = new javax.swing.GroupLayout(OrnamentosTI);
        OrnamentosTI.setLayout(OrnamentosTILayout);
        OrnamentosTILayout.setHorizontalGroup(
            OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrnamentosTILayout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrnamentosTILayout.createSequentialGroup()
                        .addComponent(JLArenaRutilanteTI)
                        .addGap(144, 144, 144)
                        .addComponent(JLBelobogDosArquitetosTI)
                        .addGap(125, 125, 125)
                        .addComponent(JLDiferenciadorCelestialTI)
                        .addGap(98, 98, 98)
                        .addComponent(JLEmpresaMercantilPanCosmicaTI)
                        .addGap(81, 81, 81)
                        .addComponent(JLEstacaoDeVedacaoEspacialTI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(JLFrotaDosEternosTI))
                    .addGroup(OrnamentosTILayout.createSequentialGroup()
                        .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(OrnamentosTILayout.createSequentialGroup()
                                .addComponent(JLLinhaDeFrenteTI)
                                .addGap(116, 116, 116)
                                .addComponent(JLPenaconyTerraDosSonhosTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLQuilhaQuebradaTI))
                            .addGroup(OrnamentosTILayout.createSequentialGroup()
                                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BGlamothTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BArenaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(153, 153, 153)
                                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BBelobogTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BPenaconyTI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addGap(166, 166, 166)
                                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BDiferenciadorTI)
                                    .addComponent(BQuilhaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(162, 162, 162)
                        .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(OrnamentosTILayout.createSequentialGroup()
                                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BSalsottoTI)
                                    .addComponent(BEmpresaMercantilTI, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrnamentosTILayout.createSequentialGroup()
                                        .addComponent(BEstacaoTI)
                                        .addGap(150, 150, 150))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrnamentosTILayout.createSequentialGroup()
                                        .addComponent(BTaliaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(147, 147, 147)))
                                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BFrotaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BVonwacqTI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addGroup(OrnamentosTILayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(JLSalsottoInertteTI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(JLTaliaReinoDoBanditismoTI)
                                .addGap(129, 129, 129)
                                .addComponent(JLVonwacqVivazTI)))))
                .addGap(96, 96, 96))
            .addGroup(OrnamentosTILayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(JLFirmamentoDeGlamothTI)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        OrnamentosTILayout.setVerticalGroup(
            OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrnamentosTILayout.createSequentialGroup()
                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(OrnamentosTILayout.createSequentialGroup()
                            .addGap(60, 60, 60)
                            .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BBelobogTI)
                                .addComponent(BEstacaoTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BFrotaTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BArenaTI)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OrnamentosTILayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(BEmpresaMercantilTI)))
                    .addComponent(BDiferenciadorTI, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(OrnamentosTILayout.createSequentialGroup()
                        .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLEstacaoDeVedacaoEspacialTI)
                            .addComponent(JLFrotaDosEternosTI))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                        .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BQuilhaTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BTaliaTI, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BVonwacqTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(OrnamentosTILayout.createSequentialGroup()
                        .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLArenaRutilanteTI)
                            .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(JLBelobogDosArquitetosTI)
                                .addComponent(JLDiferenciadorCelestialTI)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BPenaconyTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BGlamothTI, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, OrnamentosTILayout.createSequentialGroup()
                        .addComponent(JLEmpresaMercantilPanCosmicaTI)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BSalsottoTI, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(OrnamentosTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JLLinhaDeFrenteTI)
                    .addComponent(JLPenaconyTerraDosSonhosTI)
                    .addComponent(JLQuilhaQuebradaTI)
                    .addComponent(JLSalsottoInertteTI)
                    .addComponent(JLTaliaReinoDoBanditismoTI)
                    .addComponent(JLVonwacqVivazTI))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JLFirmamentoDeGlamothTI)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        PastaTI.addTab("Ornamentos", OrnamentosTI);

        TLTI.setBackground(new java.awt.Color(204, 204, 255));

        TierSTL.setBackground(new java.awt.Color(153, 153, 153));

        VermelhoTL.setBackground(new java.awt.Color(255, 102, 51));

        TxtSTL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtSTL.setText("S");

        javax.swing.GroupLayout VermelhoTLLayout = new javax.swing.GroupLayout(VermelhoTL);
        VermelhoTL.setLayout(VermelhoTLLayout);
        VermelhoTLLayout.setHorizontalGroup(
            VermelhoTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(VermelhoTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VermelhoTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtSTL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        VermelhoTLLayout.setVerticalGroup(
            VermelhoTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(VermelhoTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VermelhoTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtSTL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        BFuXuanTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\FuXuan.png")); // NOI18N
        BFuXuanTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BFuXuanTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BFuXuanTLActionPerformed(evt);
            }
        });

        BSilverWolfTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\SilverWolf.jpg")); // NOI18N
        BSilverWolfTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSilverWolfTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSilverWolfTLActionPerformed(evt);
            }
        });

        BLunaeTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\DanHeng.png")); // NOI18N
        BLunaeTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLunaeTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLunaeTLActionPerformed(evt);
            }
        });

        BBronyaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Bronya.jpg")); // NOI18N
        BBronyaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBronyaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBronyaTLActionPerformed(evt);
            }
        });

        BJingliuTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Jingliu.jpg")); // NOI18N
        BJingliuTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BJingliuTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJingliuTLActionPerformed(evt);
            }
        });

        BHuohuoTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Huohuo.jpg")); // NOI18N
        BHuohuoTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHuohuoTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHuohuoTLActionPerformed(evt);
            }
        });

        BSeeleTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Seele.jpg")); // NOI18N
        BSeeleTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSeeleTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSeeleTLActionPerformed(evt);
            }
        });

        BTingyunTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Tingyun.jpg")); // NOI18N
        BTingyunTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTingyunTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTingyunTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TierSTLLayout = new javax.swing.GroupLayout(TierSTL);
        TierSTL.setLayout(TierSTLLayout);
        TierSTLLayout.setHorizontalGroup(
            TierSTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierSTLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VermelhoTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BFuXuanTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSilverWolfTL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLunaeTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBronyaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BJingliuTL, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BHuohuoTL)
                .addGap(5, 5, 5)
                .addComponent(BSeeleTL, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTingyunTL)
                .addContainerGap())
        );
        TierSTLLayout.setVerticalGroup(
            TierSTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierSTLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TierSTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(VermelhoTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TierSTLLayout.createSequentialGroup()
                        .addGroup(TierSTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTingyunTL)
                            .addComponent(BHuohuoTL)
                            .addComponent(BSeeleTL)
                            .addComponent(BJingliuTL)
                            .addComponent(BBronyaTL)
                            .addComponent(BLunaeTL)
                            .addComponent(BSilverWolfTL)
                            .addComponent(BFuXuanTL, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TierATL.setBackground(new java.awt.Color(153, 153, 153));

        LaranjaTL.setBackground(new java.awt.Color(255, 153, 51));

        TxtATL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtATL.setText("A");

        javax.swing.GroupLayout LaranjaTLLayout = new javax.swing.GroupLayout(LaranjaTL);
        LaranjaTL.setLayout(LaranjaTLLayout);
        LaranjaTLLayout.setHorizontalGroup(
            LaranjaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(LaranjaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LaranjaTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtATL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        LaranjaTLLayout.setVerticalGroup(
            LaranjaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(LaranjaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LaranjaTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtATL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        BLuochaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Luocha.jpg")); // NOI18N
        BLuochaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLuochaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLuochaTLActionPerformed(evt);
            }
        });

        BBladeTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Blade.jpg")); // NOI18N
        BBladeTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBladeTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBladeTLActionPerformed(evt);
            }
        });

        BGepardTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Gepard.jpg")); // NOI18N
        BGepardTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGepardTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGepardTLActionPerformed(evt);
            }
        });

        BArgentiTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Argenti.jpg")); // NOI18N
        BArgentiTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BArgentiTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArgentiTLActionPerformed(evt);
            }
        });

        BPelaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Pela.jpg")); // NOI18N
        BPelaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BPelaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BPelaTLActionPerformed(evt);
            }
        });

        BKafkaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Kafka.jpg")); // NOI18N
        BKafkaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BKafkaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BKafkaTLActionPerformed(evt);
            }
        });

        BTopazTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Topaz.jpg")); // NOI18N
        BTopazTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTopazTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTopazTLActionPerformed(evt);
            }
        });

        BBailuTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Bailu.jpg")); // NOI18N
        BBailuTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BBailuTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BBailuTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TierATLLayout = new javax.swing.GroupLayout(TierATL);
        TierATL.setLayout(TierATLLayout);
        TierATLLayout.setHorizontalGroup(
            TierATLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierATLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LaranjaTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLuochaTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBladeTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BGepardTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BArgentiTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BPelaTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BKafkaTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTopazTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BBailuTL)
                .addContainerGap(579, Short.MAX_VALUE))
        );
        TierATLLayout.setVerticalGroup(
            TierATLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierATLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TierATLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LaranjaTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TierATLLayout.createSequentialGroup()
                        .addGroup(TierATLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(BTopazTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BKafkaTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BBailuTL)
                            .addComponent(BPelaTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BArgentiTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BGepardTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BBladeTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BLuochaTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TierBTL.setBackground(new java.awt.Color(153, 153, 153));

        AmareloTL.setBackground(new java.awt.Color(255, 255, 51));

        TxtBTl.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtBTl.setText("B");

        javax.swing.GroupLayout AmareloTLLayout = new javax.swing.GroupLayout(AmareloTL);
        AmareloTL.setLayout(AmareloTLLayout);
        AmareloTLLayout.setHorizontalGroup(
            AmareloTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(AmareloTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AmareloTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtBTl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        AmareloTLLayout.setVerticalGroup(
            AmareloTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(AmareloTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(AmareloTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtBTl)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        BWeltTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Welt.jpg")); // NOI18N
        BWeltTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BWeltTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BWeltTLActionPerformed(evt);
            }
        });

        BJingYuanTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\JingYuan.png")); // NOI18N
        BJingYuanTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BJingYuanTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BJingYuanTLActionPerformed(evt);
            }
        });

        BClaraTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Clara.jpg")); // NOI18N
        BClaraTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BClaraTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BClaraTLActionPerformed(evt);
            }
        });

        BLynxTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Lynx.jpg")); // NOI18N
        BLynxTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLynxTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLynxTLActionPerformed(evt);
            }
        });

        BHanyaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Hanya.jpg")); // NOI18N
        BHanyaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHanyaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHanyaTLActionPerformed(evt);
            }
        });

        BAstaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Asta.jpg")); // NOI18N
        BAstaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BAstaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAstaTLActionPerformed(evt);
            }
        });

        BQingqueTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Qingque.jpg")); // NOI18N
        BQingqueTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BQingqueTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BQingqueTLActionPerformed(evt);
            }
        });

        BTrailblazerFTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\TrailBlazerF.jpg")); // NOI18N
        BTrailblazerFTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTrailblazerFTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrailblazerFTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TierBTLLayout = new javax.swing.GroupLayout(TierBTL);
        TierBTL.setLayout(TierBTLLayout);
        TierBTLLayout.setHorizontalGroup(
            TierBTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierBTLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(AmareloTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BWeltTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BJingYuanTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BClaraTL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLynxTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BHanyaTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BAstaTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BQingqueTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTrailblazerFTL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TierBTLLayout.setVerticalGroup(
            TierBTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TierBTLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TierBTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(BLynxTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(AmareloTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHanyaTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BAstaTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(TierBTLLayout.createSequentialGroup()
                        .addComponent(BTrailblazerFTL)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(TierBTLLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TierBTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BQingqueTL)
                            .addComponent(BClaraTL)
                            .addComponent(BJingYuanTL)
                            .addComponent(BWeltTL))))
                .addContainerGap())
        );

        TierCTL.setBackground(new java.awt.Color(153, 153, 153));

        LimaTL.setBackground(new java.awt.Color(204, 255, 0));

        TxtCTL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtCTL.setText("C");

        javax.swing.GroupLayout LimaTLLayout = new javax.swing.GroupLayout(LimaTL);
        LimaTL.setLayout(LimaTLLayout);
        LimaTLLayout.setHorizontalGroup(
            LimaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(LimaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LimaTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtCTL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        LimaTLLayout.setVerticalGroup(
            LimaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(LimaTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(LimaTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtCTL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        BNatashaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Natasha.jpg")); // NOI18N
        BNatashaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BNatashaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BNatashaTLActionPerformed(evt);
            }
        });

        BYanqingTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Yanqing.jpg")); // NOI18N
        BYanqingTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BYanqingTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYanqingTLActionPerformed(evt);
            }
        });

        BYukongTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Yukong.jpg")); // NOI18N
        BYukongTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BYukongTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BYukongTLActionPerformed(evt);
            }
        });

        BHimekoTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Himeko.jpg")); // NOI18N
        BHimekoTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHimekoTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHimekoTLActionPerformed(evt);
            }
        });

        BSushangTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Sushang.jpg")); // NOI18N
        BSushangTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSushangTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSushangTLActionPerformed(evt);
            }
        });

        BGuinaifenTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Guinaifen.jpg")); // NOI18N
        BGuinaifenTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BGuinaifenTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BGuinaifenTLActionPerformed(evt);
            }
        });

        BMarchTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\March7th.jpeg")); // NOI18N
        BMarchTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BMarchTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BMarchTLActionPerformed(evt);
            }
        });

        BHengTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\DanHeng.jpg")); // NOI18N
        BHengTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHengTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHengTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TierCTLLayout = new javax.swing.GroupLayout(TierCTL);
        TierCTL.setLayout(TierCTLLayout);
        TierCTLLayout.setHorizontalGroup(
            TierCTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierCTLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LimaTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BNatashaTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BYanqingTL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BYukongTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BHimekoTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSushangTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BGuinaifenTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BMarchTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BHengTL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TierCTLLayout.setVerticalGroup(
            TierCTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierCTLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TierCTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BHengTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BGuinaifenTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LimaTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BYanqingTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TierCTLLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(TierCTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(BSushangTL)
                            .addComponent(BHimekoTL)
                            .addComponent(BYukongTL)))
                    .addGroup(TierCTLLayout.createSequentialGroup()
                        .addGroup(TierCTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BMarchTL)
                            .addComponent(BNatashaTL))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        TierDTL.setBackground(new java.awt.Color(153, 153, 153));

        VerdeTL.setBackground(new java.awt.Color(153, 255, 0));

        TxtDTL.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        TxtDTL.setText("D");

        javax.swing.GroupLayout VerdeTLLayout = new javax.swing.GroupLayout(VerdeTL);
        VerdeTL.setLayout(VerdeTLLayout);
        VerdeTLLayout.setHorizontalGroup(
            VerdeTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
            .addGroup(VerdeTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VerdeTLLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(TxtDTL)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        VerdeTLLayout.setVerticalGroup(
            VerdeTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(VerdeTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(VerdeTLLayout.createSequentialGroup()
                    .addGap(0, 50, Short.MAX_VALUE)
                    .addComponent(TxtDTL)
                    .addGap(0, 50, Short.MAX_VALUE)))
        );

        BLukaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Luka.jpeg")); // NOI18N
        BLukaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BLukaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLukaTLActionPerformed(evt);
            }
        });

        BSampoTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Sampo.jpg")); // NOI18N
        BSampoTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BSampoTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSampoTLActionPerformed(evt);
            }
        });

        BHookTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Hook.jpg")); // NOI18N
        BHookTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHookTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHookTLActionPerformed(evt);
            }
        });

        BServalTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Serval.jpg")); // NOI18N
        BServalTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BServalTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BServalTLActionPerformed(evt);
            }
        });

        BTrailblazerPTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\TrailBlazerP.jpg")); // NOI18N
        BTrailblazerPTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BTrailblazerPTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTrailblazerPTLActionPerformed(evt);
            }
        });

        BArlanTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Arlan.jpg")); // NOI18N
        BArlanTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BArlanTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BArlanTLActionPerformed(evt);
            }
        });

        BHertaTL.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\OneDrive\\Área de Trabalho\\Imagens\\Personagens\\Herta.jpg")); // NOI18N
        BHertaTL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BHertaTL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHertaTLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TierDTLLayout = new javax.swing.GroupLayout(TierDTL);
        TierDTL.setLayout(TierDTLLayout);
        TierDTLLayout.setHorizontalGroup(
            TierDTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TierDTLLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(VerdeTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLukaTL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BSampoTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BHookTL, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BServalTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BTrailblazerPTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BArlanTL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BHertaTL)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TierDTLLayout.setVerticalGroup(
            TierDTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TierDTLLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TierDTLLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VerdeTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHertaTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BArlanTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BServalTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BTrailblazerPTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BHookTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BLukaTL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BSampoTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout TLTILayout = new javax.swing.GroupLayout(TLTI);
        TLTI.setLayout(TLTILayout);
        TLTILayout.setHorizontalGroup(
            TLTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TLTILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TLTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TierSTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TierATL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TierBTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TierCTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TierDTL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        TLTILayout.setVerticalGroup(
            TLTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TLTILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TierSTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TierATL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TierBTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TierCTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TierDTL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PastaTI.addTab("Tier List", TLTI);

        javax.swing.GroupLayout TelaInicialTILayout = new javax.swing.GroupLayout(TelaInicialTI);
        TelaInicialTI.setLayout(TelaInicialTILayout);
        TelaInicialTILayout.setHorizontalGroup(
            TelaInicialTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaInicialTILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PastaTI)
                .addContainerGap())
        );
        TelaInicialTILayout.setVerticalGroup(
            TelaInicialTILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaInicialTILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PastaTI, javax.swing.GroupLayout.PREFERRED_SIZE, 870, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaInicialTI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaInicialTI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BArgentiTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArgentiTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BArgentiTIActionPerformed

    private void BBailuTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBailuTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 2;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBailuTIActionPerformed

    private void BFuXuanTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFuXuanTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 7   ;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFuXuanTIActionPerformed

    private void BGepardTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGepardTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 8;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGepardTIActionPerformed

    private void BHimekoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHimekoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 10;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHimekoTIActionPerformed

    private void BWeltTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWeltTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 20;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BWeltTIActionPerformed

    private void BFuXuanTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFuXuanTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 7;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFuXuanTLActionPerformed

    private void BGepardTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGepardTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 8;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGepardTLActionPerformed

    private void BArgentiTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArgentiTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BArgentiTLActionPerformed

    private void BBailuTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBailuTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 2;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBailuTLActionPerformed

    private void BWeltTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BWeltTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 20;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BWeltTLActionPerformed

    private void BHimekoTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHimekoTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 9;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHimekoTLActionPerformed

    private void BAlgoInsubstituivelTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAlgoInsubstituivelTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAlgoInsubstituivelTIActionPerformed

    private void BEuSereiMinhaPropriaEspadaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEuSereiMinhaPropriaEspadaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEuSereiMinhaPropriaEspadaTIActionPerformed

    private void BMaisClaroDoQueOSolTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMaisClaroDoQueOSolTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMaisClaroDoQueOSolTIActionPerformed

    private void BNaQuedaDeUmAeonTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNaQuedaDeUmAeonTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BNaQuedaDeUmAeonTIActionPerformed

    private void BOLadoInacessivelTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOLadoInacessivelTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BOLadoInacessivelTIActionPerformed

    private void BAsToupeirasTeDaoBoasVindasTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAsToupeirasTeDaoBoasVindasTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAsToupeirasTeDaoBoasVindasTIActionPerformed

    private void BAuHoraDePassearTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAuHoraDePassearTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAuHoraDePassearTIActionPerformed

    private void BSemEscapatoriaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSemEscapatoriaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSemEscapatoriaTIActionPerformed

    private void BSobOCeuAzulTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSobOCeuAzulTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSobOCeuAzulTIActionPerformed

    private void BUmVotoSecretoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUmVotoSecretoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BUmVotoSecretoTIActionPerformed

    private void BCasaDestruidaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCasaDestruidaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCasaDestruidaTIActionPerformed

    private void BCeuColapsadoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCeuColapsadoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCeuColapsadoTIActionPerformed

    private void BMorteMutuaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMorteMutuaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMorteMutuaTIActionPerformed

    private void BEcosDoCaixaoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEcosDoCaixaoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEcosDoCaixaoTIActionPerformed

    private void BNoiteAterrorizanteTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNoiteAterrorizanteTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BNoiteAterrorizanteTIActionPerformed

    private void BOTempoNaoEsperaPorNinguemTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOTempoNaoEsperaPorNinguemTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BOTempoNaoEsperaPorNinguemTIActionPerformed

    private void BConversaPosOperatoriaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BConversaPosOperatoriaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BConversaPosOperatoriaTIActionPerformed

    private void BEiEstouAquiTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEiEstouAquiTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEiEstouAquiTIActionPerformed

    private void BMomentoPerfeitoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMomentoPerfeitoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMomentoPerfeitoTIActionPerformed

    private void BOCalorEncurtaAsNoitesGeladasTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOCalorEncurtaAsNoitesGeladasTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BOCalorEncurtaAsNoitesGeladasTIActionPerformed

    private void BQuidProQuoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQuidProQuoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BQuidProQuoTIActionPerformed

    private void BSentimentoCompartilhadoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSentimentoCompartilhadoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSentimentoCompartilhadoTIActionPerformed

    private void BCornucopiaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCornucopiaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCornucopiaTIActionPerformed

    private void BFrutaDelicadaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFrutaDelicadaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFrutaDelicadaTIActionPerformed

    private void BMultiplicacaoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMultiplicacaoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMultiplicacaoTIActionPerformed

    private void BInquietanteExtasianteTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInquietanteExtasianteTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BInquietanteExtasianteTIActionPerformed

    private void BNaNoiteTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNaNoiteTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BNaNoiteTIActionPerformed

    private void BPercorrendoOMarEstelarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPercorrendoOMarEstelarTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPercorrendoOMarEstelarTIActionPerformed

    private void BSonoProfundoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSonoProfundoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSonoProfundoTIActionPerformed

    private void BApenasOSilencioSobrouTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BApenasOSilencioSobrouTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BApenasOSilencioSobrouTIActionPerformed

    private void BInscrevaSeParaMaisTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BInscrevaSeParaMaisTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BInscrevaSeParaMaisTIActionPerformed

    private void BJogoDeEspadasTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJogoDeEspadasTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BJogoDeEspadasTIActionPerformed

    private void BORioCorreNaPrimaveraTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BORioCorreNaPrimaveraTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BORioCorreNaPrimaveraTIActionPerformed

    private void BRetornoAEscuridaoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRetornoAEscuridaoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BRetornoAEscuridaoTIActionPerformed

    private void BFlechaVelozTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFlechaVelozTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFlechaVelozTIActionPerformed

    private void BFlechasTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFlechasTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFlechasTIActionPerformed

    private void BAntagonistaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAntagonistaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAntagonistaTIActionPerformed

    private void BAntesDoAmanhecerTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAntesDoAmanhecerTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAntesDoAmanhecerTIActionPerformed

    private void BNoiteNaViaLacteaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNoiteNaViaLacteaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BNoiteNaViaLacteaTIActionPerformed

    private void BUmInstanteEternamenteAdoradoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BUmInstanteEternamenteAdoradoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BUmInstanteEternamenteAdoradoTIActionPerformed

    private void BASolenidadeDoCafeDaManhaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BASolenidadeDoCafeDaManhaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BASolenidadeDoCafeDaManhaTIActionPerformed

    private void BFacaOMundoClamarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFacaOMundoClamarTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFacaOMundoClamarTIActionPerformed

    private void BHojeEMaisUmDiaDePazTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHojeEMaisUmDiaDePazTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHojeEMaisUmDiaDePazTIActionPerformed

    private void BMeuProprioNascimentoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMeuProprioNascimentoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMeuProprioNascimentoTIActionPerformed

    private void BRepousoDosGeniosTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRepousoDosGeniosTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BRepousoDosGeniosTIActionPerformed

    private void BBancoDeDadosTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBancoDeDadosTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBancoDeDadosTIActionPerformed

    private void BChaveMestraTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BChaveMestraTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BChaveMestraTIActionPerformed

    private void BSagacidadeTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSagacidadeTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSagacidadeTIActionPerformed

    private void BMasABatalhaNaoAcabouTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMasABatalhaNaoAcabouTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMasABatalhaNaoAcabouTIActionPerformed

    private void BMeuPassadoNoEspelhoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMeuPassadoNoEspelhoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMeuPassadoNoEspelhoTIActionPerformed

    private void BDanceDanceDanceTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDanceDanceDanceTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BDanceDanceDanceTIActionPerformed

    private void BEncontroPlanetarioTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEncontroPlanetarioTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEncontroPlanetarioTIActionPerformed

    private void BEsculpindoALuaTecendoAsNuvensTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEsculpindoALuaTecendoAsNuvensTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEsculpindoALuaTecendoAsNuvensTIActionPerformed

    private void BMemoriasDoPassadoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMemoriasDoPassadoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMemoriasDoPassadoTIActionPerformed

    private void BPassadoEFuturoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPassadoEFuturoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPassadoEFuturoTIActionPerformed

    private void BMeditacaoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMeditacaoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMeditacaoTIActionPerformed

    private void BRedeDeEngrenagensTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRedeDeEngrenagensTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BRedeDeEngrenagensTIActionPerformed

    private void BRefraoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRefraoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BRefraoTIActionPerformed

    private void BChuvaConstanteTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BChuvaConstanteTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BChuvaConstanteTIActionPerformed

    private void BCuraSolitariaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCuraSolitariaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCuraSolitariaTIActionPerformed

    private void BEmNomeDoMundoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmNomeDoMundoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEmNomeDoMundoTIActionPerformed

    private void BVoceSoPrecisaDePacienciaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVoceSoPrecisaDePacienciaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BVoceSoPrecisaDePacienciaTIActionPerformed

    private void BADeterminacaoBrilhaComoGotasDeSuorTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BADeterminacaoBrilhaComoGotasDeSuorTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BADeterminacaoBrilhaComoGotasDeSuorTIActionPerformed

    private void BAindaNosVeremosDeNovoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAindaNosVeremosDeNovoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAindaNosVeremosDeNovoTIActionPerformed

    private void BAntesDoInicioDaMissaoDoTutorialTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAntesDoInicioDaMissaoDoTutorialTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAntesDoInicioDaMissaoDoTutorialTIActionPerformed

    private void BBoaNoiteEDurmaBemTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBoaNoiteEDurmaBemTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBoaNoiteEDurmaBemTIActionPerformed

    private void BFermataTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFermataTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFermataTIActionPerformed

    private void BOlhosDaPresaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOlhosDaPresaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BOlhosDaPresaTIActionPerformed

    private void BLoopTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLoopTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLoopTIActionPerformed

    private void BSombraOcultaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSombraOcultaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSombraOcultaTIActionPerformed

    private void BVazioTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVazioTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BVazioTIActionPerformed

    private void BElaJaFechouSeusOlhosTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BElaJaFechouSeusOlhosTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BElaJaFechouSeusOlhosTIActionPerformed

    private void BEssaSouEuTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEssaSouEuTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEssaSouEuTIActionPerformed

    private void BPrimeiroDiaDaMinhaVidaNovaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPrimeiroDiaDaMinhaVidaNovaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPrimeiroDiaDaMinhaVidaNovaTIActionPerformed

    private void BMomentoDeVitoriaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMomentoDeVitoriaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMomentoDeVitoriaTIActionPerformed

    private void BSomosFogoVivoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSomosFogoVivoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSomosFogoVivoTIActionPerformed

    private void BTexturaDeMemoriasTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTexturaDeMemoriasTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTexturaDeMemoriasTIActionPerformed

    private void BTendenciaDoMercadoUniversalTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTendenciaDoMercadoUniversalTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTendenciaDoMercadoUniversalTIActionPerformed

    private void BAEscolhaDosLandauTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAEscolhaDosLandauTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAEscolhaDosLandauTIActionPerformed

    private void BAmbarTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAmbarTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAmbarTIActionPerformed

    private void BDefesaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDefesaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BDefesaTIActionPerformed

    private void BPioneirismoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPioneirismoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                cjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPioneirismoTIActionPerformed

    private void BAguiaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAguiaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAguiaTIActionPerformed

    private void BAndarilhoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAndarilhoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAndarilhoTIActionPerformed

    private void BArtesaoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArtesaoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BArtesaoTIActionPerformed

    private void BBandaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBandaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBandaTIActionPerformed

    private void BCacadorTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCacadorTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCacadorTIActionPerformed

    private void BCampeaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCampeaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCampeaTIActionPerformed

    private void BCavaleiraTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCavaleiraTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BCavaleiraTIActionPerformed

    private void BDicipulaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDicipulaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BDicipulaTIActionPerformed

    private void BGenioTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGenioTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGenioTIActionPerformed

    private void BGraoDuqueTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGraoDuqueTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGraoDuqueTIActionPerformed

    private void BGuardaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuardaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGuardaTIActionPerformed

    private void BLadraoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLadraoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLadraoTIActionPerformed

    private void BMensageiraTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMensageiraTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMensageiraTIActionPerformed

    private void BMosqueteiraTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMosqueteiraTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMosqueteiraTIActionPerformed

    private void BPrisioneiroTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPrisioneiroTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPrisioneiroTIActionPerformed

    private void BTranseunteTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTranseunteTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 1;
                ReliquiaJF rjf = new ReliquiaJF(i);
                rjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTranseunteTIActionPerformed

    private void BArenaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArenaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BArenaTIActionPerformed

    private void BGlamothTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGlamothTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGlamothTIActionPerformed

    private void BEstacaoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEstacaoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEstacaoTIActionPerformed

    private void BEmpresaMercantilTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEmpresaMercantilTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BEmpresaMercantilTIActionPerformed

    private void BDiferenciadorTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDiferenciadorTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BDiferenciadorTIActionPerformed

    private void BBelobogTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBelobogTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBelobogTIActionPerformed

    private void BPenaconyTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPenaconyTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPenaconyTIActionPerformed

    private void BQuilhaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQuilhaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BQuilhaTIActionPerformed

    private void BSalsottoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSalsottoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSalsottoTIActionPerformed

    private void BTaliaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTaliaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTaliaTIActionPerformed

    private void BVonwacqTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BVonwacqTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BVonwacqTIActionPerformed

    private void BFrotaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BFrotaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                ojf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BFrotaTIActionPerformed

    private void BBladeTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBladeTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 3;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBladeTIActionPerformed

    private void BBronyaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBronyaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 4;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBronyaTIActionPerformed

    private void BClaraTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClaraTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 5;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BClaraTIActionPerformed

    private void BLunaeTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLunaeTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 6;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLunaeTIActionPerformed

    private void BHuohuoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHuohuoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 10;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHuohuoTIActionPerformed

    private void BJingYuanTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJingYuanTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 11;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BJingYuanTIActionPerformed

    private void BJingliuTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJingliuTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 12;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BJingliuTIActionPerformed

    private void BKafkaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKafkaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 13;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BKafkaTIActionPerformed

    private void BLuochaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLuochaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 14;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLuochaTIActionPerformed

    private void BSeeleTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSeeleTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 15;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSeeleTIActionPerformed

    private void BSilverWolfTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSilverWolfTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 16;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSilverWolfTIActionPerformed

    private void BTopazTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTopazTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 17;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTopazTIActionPerformed

    private void BTrailblazerFTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrailblazerFTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 18;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTrailblazerFTIActionPerformed

    private void BTrailblazerPTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrailblazerPTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 19;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTrailblazerPTIActionPerformed

    private void BYanqingTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYanqingTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 21;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BYanqingTIActionPerformed

    private void BArlanTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArlanTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 12;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BArlanTIActionPerformed

    private void BAstaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAstaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 22;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAstaTIActionPerformed

    private void BHengTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHengTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 24;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHengTIActionPerformed

    private void BGuinaifenTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuinaifenTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 25;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGuinaifenTIActionPerformed

    private void BHanyaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHanyaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 26;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHanyaTIActionPerformed

    private void BHertaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHertaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 27;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHertaTIActionPerformed

    private void BHookTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHookTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 28;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHookTIActionPerformed

    private void BLukaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLukaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 29;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLukaTIActionPerformed

    private void BLynxTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLynxTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 30;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLynxTIActionPerformed

    private void BMarchTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMarchTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 31;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMarchTIActionPerformed

    private void BNatashaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNatashaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 32;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BNatashaTIActionPerformed

    private void BPelaTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPelaTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 33;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPelaTIActionPerformed

    private void BQingqueTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQingqueTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 34;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BQingqueTIActionPerformed

    private void BSampoTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSampoTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 35;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSampoTIActionPerformed

    private void BServalTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BServalTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 36;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BServalTIActionPerformed

    private void BSushangTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSushangTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 37;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSushangTIActionPerformed

    private void BTingyunTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTingyunTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 38;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTingyunTIActionPerformed

    private void BYukongTIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYukongTIActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 39;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BYukongTIActionPerformed

    private void BSilverWolfTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSilverWolfTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 16;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSilverWolfTLActionPerformed

    private void BLunaeTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLunaeTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 6;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLunaeTLActionPerformed

    private void BBronyaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBronyaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 4;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBronyaTLActionPerformed

    private void BJingliuTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJingliuTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 12;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BJingliuTLActionPerformed

    private void BHuohuoTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHuohuoTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 10;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHuohuoTLActionPerformed

    private void BSeeleTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSeeleTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 15;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSeeleTLActionPerformed

    private void BTingyunTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTingyunTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 38;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTingyunTLActionPerformed

    private void BLuochaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLuochaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 12;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLuochaTLActionPerformed

    private void BBladeTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BBladeTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 14;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BBladeTLActionPerformed

    private void BPelaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BPelaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 33;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BPelaTLActionPerformed

    private void BKafkaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BKafkaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 13;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BKafkaTLActionPerformed

    private void BTopazTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTopazTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 12;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTopazTLActionPerformed

    private void BJingYuanTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BJingYuanTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 17;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BJingYuanTLActionPerformed

    private void BClaraTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BClaraTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 5;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BClaraTLActionPerformed

    private void BLynxTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLynxTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 30;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLynxTLActionPerformed

    private void BHanyaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHanyaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 26;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHanyaTLActionPerformed

    private void BAstaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAstaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 23;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BAstaTLActionPerformed

    private void BQingqueTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BQingqueTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 34;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BQingqueTLActionPerformed

    private void BTrailblazerFTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrailblazerFTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 18;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTrailblazerFTLActionPerformed

    private void BNatashaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BNatashaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 32;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BNatashaTLActionPerformed

    private void BYanqingTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYanqingTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 21;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BYanqingTLActionPerformed

    private void BYukongTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BYukongTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 39;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BYukongTLActionPerformed

    private void BSushangTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSushangTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 37;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSushangTLActionPerformed

    private void BGuinaifenTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BGuinaifenTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 25;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BGuinaifenTLActionPerformed

    private void BMarchTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BMarchTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 31;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BMarchTLActionPerformed

    private void BHengTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHengTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 24;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHengTLActionPerformed

    private void BLukaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLukaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 29;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BLukaTLActionPerformed

    private void BSampoTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSampoTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 35;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BSampoTLActionPerformed

    private void BHookTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHookTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 28;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHookTLActionPerformed

    private void BServalTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BServalTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 36;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BServalTLActionPerformed

    private void BTrailblazerPTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTrailblazerPTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 19;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BTrailblazerPTLActionPerformed

    private void BArlanTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BArlanTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 22;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BArlanTLActionPerformed

    private void BHertaTLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHertaTLActionPerformed
        // TODO add your handling code here:
        LoginU lu = new LoginU();
        try{
            if(u.isCadastrado() == false){
                lu.setVisible(true);
            } else if(u.isCadastrado() == true){
                i = 27;
                PersonagemJF pjf = new PersonagemJF(i);
                pjf.setVisible(true);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_BHertaTLActionPerformed

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }
    
    private void InserirValores(){
        try{
        Conexao conector = new Conexao();
        conector.conectar();
        Statement st = conector.conn.createStatement();
    
        sql = "select p.ID as 'ID Personagem', p.Nome as 'Nome do Personagem', r.ID as 'ID Relíquia', r.Nome as 'Nome da Relíquia', r.Bonus as 'Bônus da Relíquia', c.ID as 'ID Cone', c.Nome as 'Nome do Cone de Luz', c.Tipo as 'Tipo do Cone', c.Descrição as 'Descrição do Cone', p.Material1 as 'Material 1' , p.Material2 as 'Material 2', p.Material3 as 'Material 3', p.Material4 as 'Material 4', p.Estatistica1 as 'Estatística 1', p.Estatistica2 as 'Estatística 2', p.Estatistica3 as 'Estatística 3', p.Estatistica4 as 'Estatística 4' from Personagens as p inner join Reliquia as r on p.Reliquias_id1 = r.ID inner join Cone as c on p.Cones_id1 = c.ID order by p.ID";
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            r.setID(Integer.parseInt(rs.getString("ID Relíquia")));
            r.setNome(rs.getString("Nome da Relíquia"));
            Reliquia.adicionarB(rs.getString("Bônus da Relíquia"));
            Personagem.adicionarR(r);
            
            c.setID(Integer.parseInt(rs.getString("ID Cone")));
            c.setNome(rs.getString("Nome do Cone de Luz"));
            c.setTipo(rs.getString("Tipo do Cone"));
            c.setDescricao(rs.getString("Descrição do Cone"));
            Personagem.adicionarC(c);
            
            p.setID(Integer.parseInt(rs.getString("ID Personagem")));
            p.setNome(rs.getString("Nome do Personagem"));
            Personagem.adicionarM(rs.getString("Material 1"));
            Personagem.adicionarM(rs.getString("Material 2"));
            Personagem.adicionarM(rs.getString("Material 3"));
            Personagem.adicionarM(rs.getString("Material 4"));
            Personagem.adicionarE(rs.getString("Estatística 1"));
            Personagem.adicionarE(rs.getString("Estatística 2"));
            Personagem.adicionarE(rs.getString("Estatística 3"));
            Personagem.adicionarE(rs.getString("Estatística 4"));
            Personagem.adicionarP(p);
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AbundanciaTI;
    private javax.swing.JPanel AmareloTL;
    private javax.swing.JLabel ArgentiTxtTI;
    private javax.swing.JLabel ArlanTxtTI;
    private javax.swing.JLabel AstaTxtTI;
    private javax.swing.JButton BADeterminacaoBrilhaComoGotasDeSuorTI;
    private javax.swing.JButton BAEscolhaDosLandauTI;
    private javax.swing.JButton BASolenidadeDoCafeDaManhaTI;
    private javax.swing.JButton BAguiaTI;
    private javax.swing.JButton BAindaNosVeremosDeNovoTI;
    private javax.swing.JButton BAlgoInsubstituivelTI;
    private javax.swing.JButton BAmbarTI;
    private javax.swing.JButton BAndarilhoTI;
    private javax.swing.JButton BAntagonistaTI;
    private javax.swing.JButton BAntesDoAmanhecerTI;
    private javax.swing.JButton BAntesDoInicioDaMissaoDoTutorialTI;
    private javax.swing.JButton BApenasOSilencioSobrouTI;
    private javax.swing.JButton BArenaTI;
    private javax.swing.JButton BArgentiTI;
    private javax.swing.JButton BArgentiTL;
    private javax.swing.JButton BArlanTI;
    private javax.swing.JButton BArlanTL;
    private javax.swing.JButton BArtesaoTI;
    private javax.swing.JButton BAsToupeirasTeDaoBoasVindasTI;
    private javax.swing.JButton BAstaTI;
    private javax.swing.JButton BAstaTL;
    private javax.swing.JButton BAuHoraDePassearTI;
    private javax.swing.JButton BBailuTI;
    private javax.swing.JButton BBailuTL;
    private javax.swing.JButton BBancoDeDadosTI;
    private javax.swing.JButton BBandaTI;
    private javax.swing.JButton BBelobogTI;
    private javax.swing.JButton BBladeTI;
    private javax.swing.JButton BBladeTL;
    private javax.swing.JButton BBoaNoiteEDurmaBemTI;
    private javax.swing.JButton BBronyaTI;
    private javax.swing.JButton BBronyaTL;
    private javax.swing.JButton BCacadorTI;
    private javax.swing.JButton BCampeaTI;
    private javax.swing.JButton BCasaDestruidaTI;
    private javax.swing.JButton BCavaleiraTI;
    private javax.swing.JButton BCeuColapsadoTI;
    private javax.swing.JButton BChaveMestraTI;
    private javax.swing.JButton BChuvaConstanteTI;
    private javax.swing.JButton BClaraTI;
    private javax.swing.JButton BClaraTL;
    private javax.swing.JButton BConversaPosOperatoriaTI;
    private javax.swing.JButton BCornucopiaTI;
    private javax.swing.JButton BCuraSolitariaTI;
    private javax.swing.JButton BDanceDanceDanceTI;
    private javax.swing.JButton BDefesaTI;
    private javax.swing.JButton BDicipulaTI;
    private javax.swing.JButton BDiferenciadorTI;
    private javax.swing.JButton BEcosDoCaixaoTI;
    private javax.swing.JButton BEiEstouAquiTI;
    private javax.swing.JButton BElaJaFechouSeusOlhosTI;
    private javax.swing.JButton BEmNomeDoMundoTI;
    private javax.swing.JButton BEmpresaMercantilTI;
    private javax.swing.JButton BEncontroPlanetarioTI;
    private javax.swing.JButton BEsculpindoALuaTecendoAsNuvensTI;
    private javax.swing.JButton BEssaSouEuTI;
    private javax.swing.JButton BEstacaoTI;
    private javax.swing.JButton BEuSereiMinhaPropriaEspadaTI;
    private javax.swing.JButton BFacaOMundoClamarTI;
    private javax.swing.JButton BFermataTI;
    private javax.swing.JButton BFlechaVelozTI;
    private javax.swing.JButton BFlechasTI;
    private javax.swing.JButton BFrotaTI;
    private javax.swing.JButton BFrutaDelicadaTI;
    private javax.swing.JButton BFuXuanTI;
    private javax.swing.JButton BFuXuanTL;
    private javax.swing.JButton BGenioTI;
    private javax.swing.JButton BGepardTI;
    private javax.swing.JButton BGepardTL;
    private javax.swing.JButton BGlamothTI;
    private javax.swing.JButton BGraoDuqueTI;
    private javax.swing.JButton BGuardaTI;
    private javax.swing.JButton BGuinaifenTI;
    private javax.swing.JButton BGuinaifenTL;
    private javax.swing.JButton BHanyaTI;
    private javax.swing.JButton BHanyaTL;
    private javax.swing.JButton BHengTI;
    private javax.swing.JButton BHengTL;
    private javax.swing.JButton BHertaTI;
    private javax.swing.JButton BHertaTL;
    private javax.swing.JButton BHimekoTI;
    private javax.swing.JButton BHimekoTL;
    private javax.swing.JButton BHojeEMaisUmDiaDePazTI;
    private javax.swing.JButton BHookTI;
    private javax.swing.JButton BHookTL;
    private javax.swing.JButton BHuohuoTI;
    private javax.swing.JButton BHuohuoTL;
    private javax.swing.JButton BInquietanteExtasianteTI;
    private javax.swing.JButton BInscrevaSeParaMaisTI;
    private javax.swing.JButton BJingYuanTI;
    private javax.swing.JButton BJingYuanTL;
    private javax.swing.JButton BJingliuTI;
    private javax.swing.JButton BJingliuTL;
    private javax.swing.JButton BJogoDeEspadasTI;
    private javax.swing.JButton BKafkaTI;
    private javax.swing.JButton BKafkaTL;
    private javax.swing.JButton BLadraoTI;
    private javax.swing.JButton BLoopTI;
    private javax.swing.JButton BLukaTI;
    private javax.swing.JButton BLukaTL;
    private javax.swing.JButton BLunaeTI;
    private javax.swing.JButton BLunaeTL;
    private javax.swing.JButton BLuochaTI;
    private javax.swing.JButton BLuochaTL;
    private javax.swing.JButton BLynxTI;
    private javax.swing.JButton BLynxTL;
    private javax.swing.JButton BMaisClaroDoQueOSolTI;
    private javax.swing.JButton BMarchTI;
    private javax.swing.JButton BMarchTL;
    private javax.swing.JButton BMasABatalhaNaoAcabouTI;
    private javax.swing.JButton BMeditacaoTI;
    private javax.swing.JButton BMemoriasDoPassadoTI;
    private javax.swing.JButton BMensageiraTI;
    private javax.swing.JButton BMeuPassadoNoEspelhoTI;
    private javax.swing.JButton BMeuProprioNascimentoTI;
    private javax.swing.JButton BMomentoDeVitoriaTI;
    private javax.swing.JButton BMomentoPerfeitoTI;
    private javax.swing.JButton BMorteMutuaTI;
    private javax.swing.JButton BMosqueteiraTI;
    private javax.swing.JButton BMultiplicacaoTI;
    private javax.swing.JButton BNaNoiteTI;
    private javax.swing.JButton BNaQuedaDeUmAeonTI;
    private javax.swing.JButton BNatashaTI;
    private javax.swing.JButton BNatashaTL;
    private javax.swing.JButton BNoiteAterrorizanteTI;
    private javax.swing.JButton BNoiteNaViaLacteaTI;
    private javax.swing.JButton BOCalorEncurtaAsNoitesGeladasTI;
    private javax.swing.JButton BOLadoInacessivelTI;
    private javax.swing.JButton BORioCorreNaPrimaveraTI;
    private javax.swing.JButton BOTempoNaoEsperaPorNinguemTI;
    private javax.swing.JButton BOlhosDaPresaTI;
    private javax.swing.JButton BPassadoEFuturoTI;
    private javax.swing.JButton BPelaTI;
    private javax.swing.JButton BPelaTL;
    private javax.swing.JButton BPenaconyTI;
    private javax.swing.JButton BPercorrendoOMarEstelarTI;
    private javax.swing.JButton BPioneirismoTI;
    private javax.swing.JButton BPrimeiroDiaDaMinhaVidaNovaTI;
    private javax.swing.JButton BPrisioneiroTI;
    private javax.swing.JButton BQingqueTI;
    private javax.swing.JButton BQingqueTL;
    private javax.swing.JButton BQuidProQuoTI;
    private javax.swing.JButton BQuilhaTI;
    private javax.swing.JButton BRedeDeEngrenagensTI;
    private javax.swing.JButton BRefraoTI;
    private javax.swing.JButton BRepousoDosGeniosTI;
    private javax.swing.JButton BRetornoAEscuridaoTI;
    private javax.swing.JButton BSagacidadeTI;
    private javax.swing.JButton BSalsottoTI;
    private javax.swing.JButton BSampoTI;
    private javax.swing.JButton BSampoTL;
    private javax.swing.JButton BSeeleTI;
    private javax.swing.JButton BSeeleTL;
    private javax.swing.JButton BSemEscapatoriaTI;
    private javax.swing.JButton BSentimentoCompartilhadoTI;
    private javax.swing.JButton BServalTI;
    private javax.swing.JButton BServalTL;
    private javax.swing.JButton BSilverWolfTI;
    private javax.swing.JButton BSilverWolfTL;
    private javax.swing.JButton BSobOCeuAzulTI;
    private javax.swing.JButton BSombraOcultaTI;
    private javax.swing.JButton BSomosFogoVivoTI;
    private javax.swing.JButton BSonoProfundoTI;
    private javax.swing.JButton BSushangTI;
    private javax.swing.JButton BSushangTL;
    private javax.swing.JButton BTaliaTI;
    private javax.swing.JButton BTendenciaDoMercadoUniversalTI;
    private javax.swing.JButton BTexturaDeMemoriasTI;
    private javax.swing.JButton BTingyunTI;
    private javax.swing.JButton BTingyunTL;
    private javax.swing.JButton BTopazTI;
    private javax.swing.JButton BTopazTL;
    private javax.swing.JButton BTrailblazerFTI;
    private javax.swing.JButton BTrailblazerFTL;
    private javax.swing.JButton BTrailblazerPTI;
    private javax.swing.JButton BTrailblazerPTL;
    private javax.swing.JButton BTranseunteTI;
    private javax.swing.JButton BUmInstanteEternamenteAdoradoTI;
    private javax.swing.JButton BUmVotoSecretoTI;
    private javax.swing.JButton BVazioTI;
    private javax.swing.JButton BVoceSoPrecisaDePacienciaTI;
    private javax.swing.JButton BVonwacqTI;
    private javax.swing.JButton BWeltTI;
    private javax.swing.JButton BWeltTL;
    private javax.swing.JButton BYanqingTI;
    private javax.swing.JButton BYanqingTL;
    private javax.swing.JButton BYukongTI;
    private javax.swing.JButton BYukongTL;
    private javax.swing.JLabel BailuTxtTI;
    private javax.swing.JLabel BladeTxtTI;
    private javax.swing.JLabel BronyaTxtTI;
    private javax.swing.JPanel CacaTI;
    private javax.swing.JLabel ClaraTxtTI;
    private javax.swing.JPanel ConesTI;
    private javax.swing.JPanel DestruicaoTI;
    private javax.swing.JPanel ErudicaoTI;
    private javax.swing.JLabel FuXuanTxtTI;
    private javax.swing.JLabel GepardTxtTI;
    private javax.swing.JLabel GuinaifenTxtTI;
    private javax.swing.JLabel HanyaTxtTI;
    private javax.swing.JPanel HarmoniaTI;
    private javax.swing.JLabel HengTxtTI;
    private javax.swing.JLabel HertaTxtTI;
    private javax.swing.JLabel HimekoTxtTI;
    private javax.swing.JLabel HookTxtTI;
    private javax.swing.JLabel HuohuoTxtTI;
    private javax.swing.JPanel InexistenciaTI;
    private javax.swing.JLabel JLADeterminacaoTI;
    private javax.swing.JLabel JLAEscolhaDosTI;
    private javax.swing.JLabel JLASolenidadeDoTI;
    private javax.swing.JLabel JLAcabouTI;
    private javax.swing.JLabel JLAeonTI;
    private javax.swing.JLabel JLAguiaDaLinhaTI;
    private javax.swing.JLabel JLAindaNosVeremosTI;
    private javax.swing.JLabel JLAlgoInsubstituivelTI;
    private javax.swing.JLabel JLAmbarTI;
    private javax.swing.JLabel JLAndarilhoDoDesertoTI;
    private javax.swing.JLabel JLAntagonistaTI;
    private javax.swing.JLabel JLAntesDoAmanhecerTI;
    private javax.swing.JLabel JLAntesDoInicioTI;
    private javax.swing.JLabel JLApenasOSilencioTI;
    private javax.swing.JLabel JLArenaRutilanteTI;
    private javax.swing.JLabel JLArtesaoDoFogoTI;
    private javax.swing.JLabel JLAsNOitesGeladasTI;
    private javax.swing.JLabel JLAsToupeirasTeDaoTI;
    private javax.swing.JLabel JLAtravessandoOTI;
    private javax.swing.JLabel JLAuHoraDeTI;
    private javax.swing.JLabel JLBancoDeDadosTI;
    private javax.swing.JLabel JLBandaTrovaoTI;
    private javax.swing.JLabel JLBelobogDosArquitetosTI;
    private javax.swing.JLabel JLBoaNoiteETI;
    private javax.swing.JLabel JLBoasVindasTI;
    private javax.swing.JLabel JLBrilhaComoGotasDeTI;
    private javax.swing.JLabel JLCacadorDaTI;
    private javax.swing.JLabel JLCafeDaManhaTI;
    private javax.swing.JLabel JLCampeaDoBoxeTI;
    private javax.swing.JLabel JLCasaDestruidaTI;
    private javax.swing.JLabel JLCavaleiraDoTI;
    private javax.swing.JLabel JLCeuColapsadoTI;
    private javax.swing.JLabel JLChamasTI;
    private javax.swing.JLabel JLChaveMestraTI;
    private javax.swing.JLabel JLChuvaConstanteTI;
    private javax.swing.JLabel JLClamarTI;
    private javax.swing.JLabel JLCompartilhadoTI;
    private javax.swing.JLabel JLConfinamentoTI;
    private javax.swing.JLabel JLConversaTI;
    private javax.swing.JLabel JLCornucopiaTI;
    private javax.swing.JLabel JLCrepitanteTI;
    private javax.swing.JLabel JLCuraSolitariaTI;
    private javax.swing.JLabel JLDaBandidagemTI;
    private javax.swing.JLabel JLDaForjaDeLavaTI;
    private javax.swing.JLabel JLDaMissaoDoTI;
    private javax.swing.JLabel JLDanceDanceTI;
    private javax.swing.JLabel JLDanceTI;
    private javax.swing.JLabel JLDeMeteorosTI;
    private javax.swing.JLabel JLDeNovoTI;
    private javax.swing.JLabel JLDePacienciaTI;
    private javax.swing.JLabel JLDeRuaTI;
    private javax.swing.JLabel JLDefesaTI;
    private javax.swing.JLabel JLDiaDePazTI;
    private javax.swing.JLabel JLDicipulaLongevaTI;
    private javax.swing.JLabel JLDiferenciadorCelestialTI;
    private javax.swing.JLabel JLDoCrepusculoTI;
    private javax.swing.JLabel JLDurmaBemTI;
    private javax.swing.JLabel JLEcosDoCaixaoTI;
    private javax.swing.JLabel JLEiEstouAquiTI;
    private javax.swing.JLabel JLElaJaFechouTI;
    private javax.swing.JLabel JLEmNomeDoMundoTI;
    private javax.swing.JLabel JLEmpresaMercantilPanCosmicaTI;
    private javax.swing.JLabel JLEncontroPlanetarioTI;
    private javax.swing.JLabel JLEngrenagensTI;
    private javax.swing.JLabel JLEsculpindoALuaTI;
    private javax.swing.JLabel JLEspelhoTI;
    private javax.swing.JLabel JLEsperaPorNinguemTI;
    private javax.swing.JLabel JLEssaSouEuTI;
    private javax.swing.JLabel JLEstacaoDeVedacaoEspacialTI;
    private javax.swing.JLabel JLEstelarTI;
    private javax.swing.JLabel JLEstrelasBrilhantesTI;
    private javax.swing.JLabel JLEternamenteAdoradoTI;
    private javax.swing.JLabel JLEuSereiMinhaTI;
    private javax.swing.JLabel JLExtasianteTI;
    private javax.swing.JLabel JLFacaOMundoTI;
    private javax.swing.JLabel JLFermataTI;
    private javax.swing.JLabel JLFirmamentoDeGlamothTI;
    private javax.swing.JLabel JLFlechaVelozTI;
    private javax.swing.JLabel JLFlechasTI;
    private javax.swing.JLabel JLFlorestaGlacialTI;
    private javax.swing.JLabel JLFrotaDosEternosTI;
    private javax.swing.JLabel JLFrutaDelicadaTI;
    private javax.swing.JLabel JLFuturoTI;
    private javax.swing.JLabel JLGenioDasTI;
    private javax.swing.JLabel JLGraoDuqueEmTI;
    private javax.swing.JLabel JLGuardaDaNeveTI;
    private javax.swing.JLabel JLHackerspaceTI;
    private javax.swing.JLabel JLHojeEMaisUmTI;
    private javax.swing.JLabel JLInscrevaSeParaTI;
    private javax.swing.JLabel JLIquietanteTI;
    private javax.swing.JLabel JLJogoDeEspadasTI;
    private javax.swing.JLabel JLLacteaTI;
    private javax.swing.JLabel JLLadraoDaChuvaTI;
    private javax.swing.JLabel JLLandauTI;
    private javax.swing.JLabel JLLinhaDeFrenteTI;
    private javax.swing.JLabel JLLoopTI;
    private javax.swing.JLabel JLMaisClaroDoQueTI;
    private javax.swing.JLabel JLMaisTI;
    private javax.swing.JLabel JLMasABatalhaNaoTI;
    private javax.swing.JLabel JLMeditacaoTI;
    private javax.swing.JLabel JLMemoriasDoPassadoTI;
    private javax.swing.JLabel JLMemoriasTI;
    private javax.swing.JLabel JLMensageiraTI;
    private javax.swing.JLabel JLMercadoUniversalTI;
    private javax.swing.JLabel JLMeuPassadoNoTI;
    private javax.swing.JLabel JLMeuProprioTI;
    private javax.swing.JLabel JLMinhaNovaVidaTI;
    private javax.swing.JLabel JLMomentoDeVitoriaTI;
    private javax.swing.JLabel JLMomentoPerfeitoTI;
    private javax.swing.JLabel JLMorteMutuaTI;
    private javax.swing.JLabel JLMosqueteiraDoTI;
    private javax.swing.JLabel JLMultiplicacaoTI;
    private javax.swing.JLabel JLNaNoiteTI;
    private javax.swing.JLabel JLNaQuedaDeUmTI;
    private javax.swing.JLabel JLNascimentoTI;
    private javax.swing.JLabel JLNoiteAterrorizanteTI;
    private javax.swing.JLabel JLNoiteNaViaTI;
    private javax.swing.JLabel JLNuvemErranteTI;
    private javax.swing.JLabel JLOCalorEncurtaTI;
    private javax.swing.JLabel JLOLadoInacessivelTI;
    private javax.swing.JLabel JLORioCorreNaTI;
    private javax.swing.JLabel JLOSolTI;
    private javax.swing.JLabel JLOTempoNaoTI;
    private javax.swing.JLabel JLOlhosDaPresaTI;
    private javax.swing.JLabel JLPalacioDaPurezaTI;
    private javax.swing.JLabel JLPassadoETI;
    private javax.swing.JLabel JLPassearTI;
    private javax.swing.JLabel JLPenaconyTerraDosSonhosTI;
    private javax.swing.JLabel JLPercorrendoOMarTI;
    private javax.swing.JLabel JLPioneirismoTI;
    private javax.swing.JLabel JLPosOperatoriaTI;
    private javax.swing.JLabel JLPrimaveraTI;
    private javax.swing.JLabel JLPrimeiroDiaDaTI;
    private javax.swing.JLabel JLPrisioneiroEmTI;
    private javax.swing.JLabel JLProfundoTI;
    private javax.swing.JLabel JLPropriaEspadaTI;
    private javax.swing.JLabel JLQuidProQuoTI;
    private javax.swing.JLabel JLQuilhaQuebradaTI;
    private javax.swing.JLabel JLRedeDeTI;
    private javax.swing.JLabel JLRefraoTI;
    private javax.swing.JLabel JLRepousoDosGeniosTI;
    private javax.swing.JLabel JLRetornoAEscuridaoTI;
    private javax.swing.JLabel JLSagacidadeTI;
    private javax.swing.JLabel JLSalsottoInertteTI;
    private javax.swing.JLabel JLSemEscapatoriaTI;
    private javax.swing.JLabel JLSentimentoTI;
    private javax.swing.JLabel JLSeusOlhosTI;
    private javax.swing.JLabel JLSobOCeuAzulTI;
    private javax.swing.JLabel JLSobrouTI;
    private javax.swing.JLabel JLSombraOcultaTI;
    private javax.swing.JLabel JLSomosFogoVivoTI;
    private javax.swing.JLabel JLSonoProfundoTI;
    private javax.swing.JLabel JLSuorTI;
    private javax.swing.JLabel JLTaliaReinoDoBanditismoTI;
    private javax.swing.JLabel JLTecendoAsNuvensTI;
    private javax.swing.JLabel JLTendenciaDoTI;
    private javax.swing.JLabel JLTexturaDeTI;
    private javax.swing.JLabel JLTitulo3TIA;
    private javax.swing.JLabel JLTitulo3TIC;
    private javax.swing.JLabel JLTitulo3TID;
    private javax.swing.JLabel JLTitulo3TIE;
    private javax.swing.JLabel JLTitulo3TIH;
    private javax.swing.JLabel JLTitulo3TII;
    private javax.swing.JLabel JLTitulo3TIP;
    private javax.swing.JLabel JLTitulo4TIA;
    private javax.swing.JLabel JLTitulo4TIC;
    private javax.swing.JLabel JLTitulo4TID;
    private javax.swing.JLabel JLTitulo4TIE;
    private javax.swing.JLabel JLTitulo4TIH;
    private javax.swing.JLabel JLTitulo4TII;
    private javax.swing.JLabel JLTitulo4TIP;
    private javax.swing.JLabel JLTitulo5TIA;
    private javax.swing.JLabel JLTitulo5TIC;
    private javax.swing.JLabel JLTitulo5TID;
    private javax.swing.JLabel JLTitulo5TIE;
    private javax.swing.JLabel JLTitulo5TIH;
    private javax.swing.JLabel JLTitulo5TII;
    private javax.swing.JLabel JLTitulo5TIP;
    private javax.swing.JLabel JLTranseunteDaTI;
    private javax.swing.JLabel JLTrigoSelvagemTI;
    private javax.swing.JLabel JLTutorialTI;
    private javax.swing.JLabel JLUivanteTI;
    private javax.swing.JLabel JLUmInstanteTI;
    private javax.swing.JLabel JLUmVotoSecretoTI;
    private javax.swing.JLabel JLVazioTI;
    private javax.swing.JLabel JLVoceSoPrecisaTI;
    private javax.swing.JLabel JLVonwacqVivazTI;
    private javax.swing.JLabel JingYuanTxtTI;
    private javax.swing.JLabel JingliuTxtTI;
    private javax.swing.JLabel KafkaTxtTI;
    private javax.swing.JPanel LaranjaTL;
    private javax.swing.JPanel LimaTL;
    private javax.swing.JLabel LukaTxtTI;
    private javax.swing.JLabel LunaeTxtTI;
    private javax.swing.JLabel LuochaTxtTI;
    private javax.swing.JLabel LynxTxtTI;
    private javax.swing.JLabel MarchTxtTI;
    private javax.swing.JLabel NatashaTxtTI;
    private javax.swing.JPanel OrnamentosTI;
    private javax.swing.JTabbedPane PastaTI;
    private javax.swing.JLabel PelaTxtTI;
    private javax.swing.JPanel PersonagensTI;
    private javax.swing.JPanel PreservacaoTI;
    private javax.swing.JLabel QingqueTxtTI;
    private javax.swing.JPanel ReliquiasTI;
    private javax.swing.JLabel SampoTxtTI;
    private javax.swing.JLabel SeeleTxtTI;
    private javax.swing.JLabel ServalTxtTI;
    private javax.swing.JLabel SilverWolfTxtTI;
    private javax.swing.JLabel SushangTxtTI;
    private javax.swing.JPanel TLTI;
    private javax.swing.JPanel TelaInicialTI;
    private javax.swing.JPanel TierATL;
    private javax.swing.JPanel TierBTL;
    private javax.swing.JPanel TierCTL;
    private javax.swing.JPanel TierDTL;
    private javax.swing.JPanel TierSTL;
    private javax.swing.JLabel TingyunTxtTI;
    private javax.swing.JLabel TopazTxtTI;
    private javax.swing.JLabel TrailblazerFTxtTI;
    private javax.swing.JLabel TrailblazerPTxtTI;
    private javax.swing.JLabel TxtATL;
    private javax.swing.JLabel TxtBTl;
    private javax.swing.JLabel TxtCTL;
    private javax.swing.JLabel TxtDTL;
    private javax.swing.JLabel TxtSTL;
    private javax.swing.JPanel VerdeTL;
    private javax.swing.JPanel VermelhoTL;
    private javax.swing.JLabel WeltTxtTI;
    private javax.swing.JLabel YanqingTxtTI;
    private javax.swing.JLabel YukongTxtTI;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
