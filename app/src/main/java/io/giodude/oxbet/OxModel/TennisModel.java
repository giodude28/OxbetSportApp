package io.giodude.oxbet.OxModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TennisModel {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    public class Datum{
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("status_more")
        @Expose
        private String statusMore;
        @SerializedName("home_team")
        @Expose
        private HomeTeam homeTeam;
        @SerializedName("away_team")
        @Expose
        private AwayTeam awayTeam;
        @SerializedName("start_at")
        @Expose
        private String startAt;
        @SerializedName("home_score")
        @Expose
        private HomeScore homeScore;
        @SerializedName("away_score")
        @Expose
        private AwayScore awayScore;
        @SerializedName("ground_type")
        @Expose
        private String groundType;
        @SerializedName("main_stat")
        @Expose
        private MainStat mainStat;
        @SerializedName("sport")
        @Expose
        private Sport sport;
        @SerializedName("season")
        @Expose
        private Season season;
        @SerializedName("league")
        @Expose
        private League league;


        public Datum(Integer id, String slug, String name, String status, String statusMore, HomeTeam homeTeam, AwayTeam awayTeam, String startAt, HomeScore homeScore, AwayScore awayScore, String groundType, MainStat mainStat, Sport sport, Season season, League league) {
            this.id = id;
            this.slug = slug;
            this.name = name;
            this.status = status;
            this.statusMore = statusMore;
            this.homeTeam = homeTeam;
            this.awayTeam = awayTeam;
            this.startAt = startAt;
            this.homeScore = homeScore;
            this.awayScore = awayScore;
            this.groundType = groundType;
            this.mainStat = mainStat;
            this.sport = sport;
            this.season = season;
            this.league = league;
        }

        public class HomeTeam{
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("slug")
            @Expose
            private String slug;
            @SerializedName("name")
            @Expose
            private String name;

            public HomeTeam(Integer id, String slug, String name) {
                this.id = id;
                this.slug = slug;
                this.name = name;
            }

            public Integer getId() {
                return id;
            }

            public String getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }
        }

        public class AwayTeam{
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("slug")
            @Expose
            private String slug;
            @SerializedName("name")
            @Expose
            private String name;

            public AwayTeam(Integer id, String slug, String name) {
                this.id = id;
                this.slug = slug;
                this.name = name;
            }
            public Integer getId() {
                return id;
            }

            public String getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }
        }

        public class MainStat{
            @SerializedName("aces")
            @Expose
            private Aces aces;
            @SerializedName("double_faults")
            @Expose
            private DoubleFaults doubleFaults;
            @SerializedName("first_serve")
            @Expose
            private FirstServe firstServe;
            @SerializedName("second_serve")
            @Expose
            private SecondServe secondServe;

            public MainStat(Aces aces, DoubleFaults doubleFaults, FirstServe firstServe, SecondServe secondServe) {
                this.aces = aces;
                this.doubleFaults = doubleFaults;
                this.firstServe = firstServe;
                this.secondServe = secondServe;
            }

            public class Aces{
                @SerializedName("home")
                @Expose
                private Integer home;
                @SerializedName("away")
                @Expose
                private Integer away;

                public Aces(Integer home, Integer away) {
                    this.home = home;
                    this.away = away;
                }

                public Integer getHome() {
                    return home;
                }

                public Integer getAway() {
                    return away;
                }
            }

            public class DoubleFaults{
                @SerializedName("home")
                @Expose
                private Integer home;
                @SerializedName("away")
                @Expose
                private Integer away;

                public DoubleFaults(Integer home, Integer away) {
                    this.home = home;
                    this.away = away;
                }

                public Integer getHome() {
                    return home;
                }

                public Integer getAway() {
                    return away;
                }
            }

            public class FirstServe{
                @SerializedName("home")
                @Expose
                private Integer home;
                @SerializedName("away")
                @Expose
                private Integer away;

                public FirstServe(Integer home, Integer away) {
                    this.home = home;
                    this.away = away;
                }

                public Integer getHome() {
                    return home;
                }

                public Integer getAway() {
                    return away;
                }
            }
            public class SecondServe{
                @SerializedName("home")
                @Expose
                private Integer home;
                @SerializedName("away")
                @Expose
                private Integer away;

                public SecondServe(Integer home, Integer away) {
                    this.home = home;
                    this.away = away;
                }

                public Integer getHome() {
                    return home;
                }

                public Integer getAway() {
                    return away;
                }
            }

            public Aces getAces() {
                return aces;
            }

            public DoubleFaults getDoubleFaults() {
                return doubleFaults;
            }

            public FirstServe getFirstServe() {
                return firstServe;
            }

            public SecondServe getSecondServe() {
                return secondServe;
            }
        }
        public class HomeScore{
            @SerializedName("current")
            @Expose
            private Integer current;
            @SerializedName("display")
            @Expose
            private Integer display;
            @SerializedName("period_1")
            @Expose
            private Integer period1;
            @SerializedName("period_2")
            @Expose
            private Integer period2;
            @SerializedName("point")
            @Expose
            private String point;

            public HomeScore(Integer current, Integer display, Integer period1, Integer period2, String point) {
                this.current = current;
                this.display = display;
                this.period1 = period1;
                this.period2 = period2;
                this.point = point;
            }

            public Integer getCurrent() {
                return current;
            }

            public Integer getDisplay() {
                return display;
            }

            public Integer getPeriod1() {
                return period1;
            }

            public Integer getPeriod2() {
                return period2;
            }

            public String getPoint() {
                return point;
            }
        }

        public class AwayScore{
            @SerializedName("current")
            @Expose
            private Integer current;
            @SerializedName("display")
            @Expose
            private Integer display;
            @SerializedName("period_1")
            @Expose
            private Integer period1;
            @SerializedName("period_2")
            @Expose
            private Integer period2;
            @SerializedName("point")
            @Expose
            private String point;

            public AwayScore(Integer current, Integer display, Integer period1, Integer period2, String point) {
                this.current = current;
                this.display = display;
                this.period1 = period1;
                this.period2 = period2;
                this.point = point;
            }

            public Integer getCurrent() {
                return current;
            }

            public Integer getDisplay() {
                return display;
            }

            public Integer getPeriod1() {
                return period1;
            }

            public Integer getPeriod2() {
                return period2;
            }

            public String getPoint() {
                return point;
            }
        }
        public class Sport{
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("slug")
            @Expose
            private Object slug;
            @SerializedName("name")
            @Expose
            private String name;

            public Sport(Integer id, Object slug, String name) {
                this.id = id;
                this.slug = slug;
                this.name = name;
            }

            public Integer getId() {
                return id;
            }

            public Object getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }
        }

        public class Season{
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("slug")
            @Expose
            private String slug;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("year_start")
            @Expose
            private Integer yearStart;
            @SerializedName("year_end")
            @Expose
            private Object yearEnd;

            public Season(Integer id, String slug, String name, Integer yearStart, Object yearEnd) {
                this.id = id;
                this.slug = slug;
                this.name = name;
                this.yearStart = yearStart;
                this.yearEnd = yearEnd;
            }

            public Integer getId() {
                return id;
            }

            public String getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }

            public Integer getYearStart() {
                return yearStart;
            }

            public Object getYearEnd() {
                return yearEnd;
            }
        }

        public class League{
            @SerializedName("id")
            @Expose
            private Integer id;
            @SerializedName("slug")
            @Expose
            private String slug;
            @SerializedName("name")
            @Expose
            private String name;

            public League(Integer id, String slug, String name) {
                this.id = id;
                this.slug = slug;
                this.name = name;
            }

            public Integer getId() {
                return id;
            }

            public String getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }
        }
        public Integer getId() {
            return id;
        }

        public String getSlug() {
            return slug;
        }

        public String getName() {
            return name;
        }

        public String getStatus() {
            return status;
        }

        public String getStatusMore() {
            return statusMore;
        }

        public HomeTeam getHomeTeam() {
            return homeTeam;
        }

        public AwayTeam getAwayTeam() {
            return awayTeam;
        }

        public String getStartAt() {
            return startAt;
        }

        public HomeScore getHomeScore() {
            return homeScore;
        }

        public AwayScore getAwayScore() {
            return awayScore;
        }

        public String getGroundType() {
            return groundType;
        }

        public MainStat getMainStat() {
            return mainStat;
        }

        public Sport getSport() {
            return sport;
        }

        public Season getSeason() {
            return season;
        }

        public League getLeague() {
            return league;
        }
    }
    public List<Datum> getData() {
        return data;
    }


}
