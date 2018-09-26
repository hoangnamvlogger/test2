package com.phule.newsfootball.controller;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.phule.newsfootball.model.Article;
import com.phule.newsfootball.model.ArticleDetail;
import com.phule.newsfootball.service.ArticleService;


@Controller
public class HomeController {

    @Autowired
    ArticleService articleService;

    @RequestMapping("/")
    public String getHome(Model model) {
		//main page
		ArrayList<Article> articles = new ArrayList<Article>();
		articles = articleService.getAllArticle();
		model.addAttribute("articles", articles);
		//sidebar
		//most viewed
		ArrayList<Article> mostviewedTemp = new ArrayList<Article>();
		mostviewedTemp = articleService.getArticles(112);
		ArrayList<Article> mostviewed = new ArrayList<Article>();
		ArrayList<Article> newestphoto = new ArrayList<Article>();
		ArrayList<Article> randomPhoto = new ArrayList<Article>();
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<112; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
		for(int i = 1 ; i < 7 ;i++){
			mostviewed.add(mostviewedTemp.get(list.get(i)));
			newestphoto.add(mostviewedTemp.get(list.get(i*2)));
		}
		for(int i = 31 ; i < 40 ;i++){
			randomPhoto.add(mostviewedTemp.get(list.get(i)));
		}
		model.addAttribute("mostviewed", mostviewed);
		model.addAttribute("newestphoto", newestphoto);
		model.addAttribute("randomPhoto", randomPhoto);
		//home
		return "home";
        //return "home";
    }

    @RequestMapping("/howtoopenpop")
    public String getPopup(Model model) {
		/*
		//main page
		ArrayList<Article> articles = new ArrayList<Article>();
		articles = articleService.getAllArticle();
		model.addAttribute("articles", articles);
		//sidebar
		//most viewed
		ArrayList<Article> mostviewedTemp = new ArrayList<Article>();
		mostviewedTemp = articleService.getArticles(150);
		ArrayList<Article> mostviewed = new ArrayList<Article>();
		ArrayList<Article> newestphoto = new ArrayList<Article>();
		ArrayList<Article> randomPhoto = new ArrayList<Article>();
		ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0; i<150; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
		for(int i = 1 ; i < 7 ;i++){
			mostviewed.add(mostviewedTemp.get(list.get(i)));
			newestphoto.add(mostviewedTemp.get(list.get(i*2)));
		}
		for(int i = 31 ; i < 40 ;i++){
			randomPhoto.add(mostviewedTemp.get(list.get(i)));
		}
		model.addAttribute("mostviewed", mostviewed);
		model.addAttribute("newestphoto", newestphoto);
		model.addAttribute("randomPhoto", randomPhoto);
		//home
		return "home";*/
        return "popup";
    }

    @RequestMapping(value = "/category/{categoryName}/{articleId}/{articleLink}", method = RequestMethod.GET)
    public String getArticleDetailByArticleId(Model model, @PathVariable("categoryName") String categoryName, @PathVariable("articleId") String articleId) {
        Article article = articleService.getArticleByArticleId(articleId);
        ArrayList<ArticleDetail> articleDetail = articleService.getArticleDetailByArticleId(articleId);
        article.setLinks(articleDetail);
        model.addAttribute("articles", article);
        //sidebar
        //most viewed
        ArrayList<Article> mostviewedTemp = new ArrayList<Article>();
        mostviewedTemp = articleService.getArticles(150);
        ArrayList<Article> mostviewed = new ArrayList<Article>();
        ArrayList<Article> newestphoto = new ArrayList<Article>();
        ArrayList<Article> randomPhoto = new ArrayList<Article>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 150; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i = 1; i < 7; i++) {
            mostviewed.add(mostviewedTemp.get(list.get(i)));
            newestphoto.add(mostviewedTemp.get(list.get(i * 2)));
        }
        for (int i = 31; i < 40; i++) {
            randomPhoto.add(mostviewedTemp.get(list.get(i)));
        }
        model.addAttribute("mostviewed", mostviewed);
        model.addAttribute("newestphoto", newestphoto);
        model.addAttribute("randomPhoto", randomPhoto);
        model.addAttribute("categoryName", categoryName.toLowerCase());
        return "article";

    }

    @RequestMapping(value = "/category/{categoryName}", method = RequestMethod.GET)
    public String getArticlesByCategoryName(Model model, @PathVariable("categoryName") String categoryName) {
        //most viewed
        ArrayList<Article> articlesByCategoryId = new ArrayList<Article>();
        articlesByCategoryId = articleService.getArticlesByCategoryName(categoryName);
        ArrayList<Article> mostviewedTemp = new ArrayList<Article>();
        mostviewedTemp = articleService.getArticles(150);
        ArrayList<Article> mostviewed = new ArrayList<Article>();
        ArrayList<Article> newestphoto = new ArrayList<Article>();
        ArrayList<Article> randomPhoto = new ArrayList<Article>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 150; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i = 1; i < 7; i++) {
            mostviewed.add(mostviewedTemp.get(list.get(i)));
            newestphoto.add(mostviewedTemp.get(list.get(i * 2)));
        }
        for (int i = 31; i < 40; i++) {
            randomPhoto.add(mostviewedTemp.get(list.get(i)));
        }
        model.addAttribute("mostviewed", mostviewed);
        model.addAttribute("newestphoto", newestphoto);
        model.addAttribute("randomPhoto", randomPhoto);
        model.addAttribute("articlesByCategoryId", articlesByCategoryId);
        model.addAttribute("categoryName", categoryName.toLowerCase());
        return "category";

    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public String getPhotosByKeyword(Model model, @RequestParam("keyword") String keyword) {
        if (keyword.equals("")) {
            return "search";
        }
        ArrayList<Article> results = new ArrayList<Article>();
        results = articleService.getArticleByKeyword(keyword);
        model.addAttribute("results", results);
        ArrayList<Article> mostviewedTemp = new ArrayList<Article>();
        mostviewedTemp = articleService.getArticles(150);
        ArrayList<Article> mostviewed = new ArrayList<Article>();
        ArrayList<Article> newestphoto = new ArrayList<Article>();
        ArrayList<Article> randomPhoto = new ArrayList<Article>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 150; i++) {
            list.add(new Integer(i));
        }
        Collections.shuffle(list);
        for (int i = 1; i < 7; i++) {
            mostviewed.add(mostviewedTemp.get(list.get(i)));
            newestphoto.add(mostviewedTemp.get(list.get(i * 2)));
        }
        for (int i = 31; i < 40; i++) {
            randomPhoto.add(mostviewedTemp.get(list.get(i)));
        }
        model.addAttribute("mostviewed", mostviewed);
        model.addAttribute("newestphoto", newestphoto);
        model.addAttribute("randomPhoto", randomPhoto);
        return "search";

    }
	/*@RequestMapping("/ranking/epl")
	public String getRanking(Model model){
	
		return "homepage2";
	}
	@RequestMapping(value="/league-table/{leagueName}",method=RequestMethod.GET)
	public String getSoccerSeasonFixturesByLeague(Model model,@PathVariable("leagueName") String leagueName){
		try {
			String leagueId = getLeagueIdFromLeagueName(leagueName);
			String leagueInfomation = GetJsonDataFromFootballAPI("http://api.football-data.org/v1/soccerseasons/"+leagueId);
			ObjectMapper mapper = new ObjectMapper();
			Soccerseason soccerSeason = mapper.readValue(leagueInfomation, Soccerseason.class);
			String schedule = GetJsonDataFromFootballAPI("http://api.football-data.org/v1/soccerseasons/"+leagueId+"/fixtures?matchday="+soccerSeason.currentMatchday);
			Schedule obj = mapper.readValue(schedule, Schedule.class);
			int numberofmatch = soccerSeason.numberOfGames/10;
			numberofmatch = soccerSeason.numberOfGames%10 > 0 ? numberofmatch++ : numberofmatch;
			obj.numberOfMatch = numberofmatch;
			obj.currentMatchDay = soccerSeason.getCurrentMatchday();
			obj.leagueName = leagueName;
			String getTeamLogoUrl = "http://api.football-data.org/v1/soccerseasons/"+leagueId+"/teams";
			String getTeamLogo = GetJsonDataFromFootballAPI(getTeamLogoUrl);
			TeamManager teams = mapper.readValue(getTeamLogo, TeamManager.class);
			for (Fixture fix : obj.fixtures) {
				for (Team team : teams.teams) {
					if(fix.getHomeTeamName().equals(team.name)){
						fix.setHomeTeamLogo(team.crestUrl);
					}
					if(fix.getAwayTeamName().equals(team.name)){
						fix.setAwayTeamLogo(team.crestUrl);
					}
				}
				
			}
			model.addAttribute("schedule", obj);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
		
	}
	@RequestMapping(value="/league-table/{leagueName}/{matchday}",method=RequestMethod.GET)
	public String getSoccerSeasonFixturesByLeagueAndMatchDay(Model model,@PathVariable("leagueName") String leagueName,@PathVariable("matchday") int matchday){
		try {
			String leagueId = getLeagueIdFromLeagueName(leagueName);
			String leagueInfomation = GetJsonDataFromFootballAPI("http://api.football-data.org/v1/soccerseasons/"+leagueId);
			ObjectMapper mapper = new ObjectMapper();
			Soccerseason soccerSeason = mapper.readValue(leagueInfomation, Soccerseason.class);
			String schedule = GetJsonDataFromFootballAPI("http://api.football-data.org/v1/soccerseasons/"+leagueId+"/fixtures?matchday="+matchday);
			Schedule obj = mapper.readValue(schedule, Schedule.class);
			int numberofmatch = soccerSeason.numberOfGames/10;
			numberofmatch = soccerSeason.numberOfGames%10 > 0 ? numberofmatch++ : numberofmatch;
			obj.numberOfMatch = numberofmatch;
			obj.currentMatchDay = matchday;
			obj.leagueName = leagueName;
			String getTeamLogoUrl = "http://api.football-data.org/v1/soccerseasons/"+leagueId+"/teams";
			String getTeamLogo = GetJsonDataFromFootballAPI(getTeamLogoUrl);
			TeamManager teams = mapper.readValue(getTeamLogo, TeamManager.class);
			for (Fixture fix : obj.fixtures) {
				for (Team team : teams.teams) {
					if(fix.getHomeTeamName().equals(team.name)){
						fix.setHomeTeamLogo(team.crestUrl);
					}
					if(fix.getAwayTeamName().equals(team.name)){
						fix.setAwayTeamLogo(team.crestUrl);
					}
				}
				
			}
			model.addAttribute("schedule", obj);
			
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "home";
		
	}
	@RequestMapping(value="/match-result/{leagueName}/{HvsA}/{id}",method=RequestMethod.GET)
	public String getMatchScoreById(Model model,@PathVariable("leagueName") String leagueName,@PathVariable("HvsA") String homevsaway,@PathVariable("id") String id){
		try {
			String resultInfomation = GetJsonDataFromFootballAPI("http://api.football-data.org/v1/fixtures/"+id);
			ObjectMapper mapper = new ObjectMapper();
			Head2HeadManager h2hManager = mapper.readValue(resultInfomation, Head2HeadManager.class);
			String leagueId = getLeagueIdFromLeagueName(leagueName);
			String getTeamLogoUrl = "http://api.football-data.org/v1/soccerseasons/"+leagueId+"/teams";
			String getTeamLogo = GetJsonDataFromFootballAPI(getTeamLogoUrl);
			TeamManager teams = mapper.readValue(getTeamLogo, TeamManager.class);
			
			for (Team team : teams.teams) {
				if(h2hManager.getFixture().getHomeTeamName().equals(team.name)){
					h2hManager.getFixture().setHomeTeamLogo(team.crestUrl);
				}
				if(h2hManager.getFixture().getAwayTeamName().equals(team.name)){
					h2hManager.getFixture().setAwayTeamLogo(team.crestUrl);
				}

			}
			h2hManager.setLeagueNameSEO(leagueName); 
			model.addAttribute("result", h2hManager);
			model.addAttribute("match",matchService.getMatchById(id));
			

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "result";
		
	}
	@RequestMapping(value="/league-standing/{leagueName}",method=RequestMethod.GET)
	public String getStandingByLeague(Model model,@PathVariable("leagueName") String leagueName){
		try {
			String leagueId = getLeagueIdFromLeagueName(leagueName);
			ObjectMapper mapper = new ObjectMapper();
			String url = "http://api.football-data.org/v1/soccerseasons/"+leagueId+"/leagueTable";
			String leagueTable = GetJsonDataFromFootballAPI(url);
			StandingManager standing = mapper.readValue(leagueTable, StandingManager.class);
			standing.setLeagueNameSEO(leagueName);
			model.addAttribute("standings", standing);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "standing";
		
	}
	@RequestMapping(value="/football-team/{teamName}/{teamId}",method=RequestMethod.GET)
	public String getTeamInfomationById(Model model,@PathVariable("teamName") String leaguteamNameeName,@PathVariable("teamId") String teamId){
		try {
			ObjectMapper mapper = new ObjectMapper();
			String url = "http://api.football-data.org/v1/teams/"+teamId;
			String teamInfo = GetJsonDataFromFootballAPI(url);
			Club club = mapper.readValue(teamInfo, Club.class);
			model.addAttribute("club", club);
			
			String urlPlayers = "http://api.football-data.org/v1/teams/"+teamId+"/players";
			String playersInfo = GetJsonDataFromFootballAPI(urlPlayers);
			PlayersByTeam players = mapper.readValue(playersInfo, PlayersByTeam.class);
			model.addAttribute("players", players);

		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return "club";
		
	}
	String getLeagueIdFromLeagueName(String leagueName)
	{
		String leagueId = "";
		if(null != leagueName && "english-premier-league".equals(leagueName))
		{
			leagueId = "398";
		}
		if(null != leagueName && "ligue1".equals(leagueName))
		{
			leagueId = "396";
		}
		if(null != leagueName && "bundesliga".equals(leagueName))
		{
			leagueId = "394";
		}
		if(null != leagueName && "bundesliga2".equals(leagueName))
		{
			leagueId = "395";
		}
		if(null != leagueName && "ligue2".equals(leagueName))
		{
			leagueId = "397";
		}
		if(null != leagueName && "laliga".equals(leagueName))
		{
			leagueId = "399";
		}
		if(null != leagueName && "laliga2".equals(leagueName))
		{
			leagueId = "400";
		}
		if(null != leagueName && "italy".equals(leagueName))
		{
			leagueId = "401";
		}
		if(null != leagueName && "portugal".equals(leagueName))
		{
			leagueId = "402";
		}
		if(null != leagueName && "uefa-champions-league".equals(leagueName))
		{
			leagueId = "405";
		}
		if(null != leagueName && "holland".equals(leagueName))
		{
			leagueId = "404";
		}
		return leagueId;
	}
	public String GetJsonDataFromFootballAPI(String targetURL) {
		HttpURLConnection connection = null;
		try {
			// Create connection
			URL url = new URL(targetURL);
			connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("X-Auth-Token", "bfe6834239a7472eaddf80938356b73b");
			connection.setUseCaches(false);
			connection.setDoOutput(true);
			// int responseCode = connection.getResponseCode();
			// Get Response
			InputStream is = connection.getInputStream();
			BufferedReader rd = new BufferedReader(new InputStreamReader(is,StandardCharsets.UTF_8));
			StringBuilder response = new StringBuilder(); // or StringBuffer if
															// not Java 5+
			String line;
			while ((line = rd.readLine()) != null) {
				response.append(line);
				response.append('\r');
			}
			rd.close();
			return response.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (connection != null) {
				connection.disconnect();
			}
		}
	}*/

}
