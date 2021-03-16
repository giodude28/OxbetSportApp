package io.giodude.oxbet.OxModel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class BasketBallModel {
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
      @SerializedName("time_details")
      @Expose
      private Object timeDetails;
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
      @SerializedName("series_count")
      @Expose
      private Integer seriesCount;
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

      public Datum(Integer id, String slug, String name, String status, String statusMore, Object timeDetails, HomeTeam homeTeam, AwayTeam awayTeam, String startAt, HomeScore homeScore,AwayScore awayScore, Integer seriesCount, MainStat mainStat, Sport sport, Season season, League league) {
          this.id = id;
          this.slug = slug;
          this.name = name;
          this.status = status;
          this.statusMore = statusMore;
          this.timeDetails = timeDetails;
          this.homeTeam = homeTeam;
          this.awayTeam = awayTeam;
          this.startAt = startAt;
          this.homeScore = homeScore;
          this.awayScore = awayScore;
          this.seriesCount = seriesCount;
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

                public HomeScore(Integer current, Integer display, Integer period1, Integer period2) {
                    this.current = current;
                    this.display = display;
                    this.period1 = period1;
                    this.period2 = period2;
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

                public AwayScore(Integer current, Integer display, Integer period1, Integer period2) {
                    this.current = current;
                    this.display = display;
                    this.period1 = period1;
                    this.period2 = period2;
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
            }

            public class MainStat{
                @SerializedName("free_throws")
                @Expose
                private FreeThrows freeThrows;
                @SerializedName("2_pointers")
                @Expose
                private TwoPointers _2Pointers;
                @SerializedName("3_pointers")
                @Expose
                private ThreePointers _3Pointers;
                @SerializedName("field_goals")
                @Expose
                private FieldGoals fieldGoals;
                @SerializedName("rebounds")
                @Expose
                private Rebounds rebounds;
                @SerializedName("fouls")
                @Expose
                private Fouls fouls;
                @SerializedName("time_spent_in_lead")
                @Expose
                private TimeSpentInLead timeSpentInLead;

                public MainStat(FreeThrows freeThrows, TwoPointers _2Pointers, ThreePointers _3Pointers, FieldGoals fieldGoals, Rebounds rebounds, Fouls fouls, TimeSpentInLead timeSpentInLead) {
                    this.freeThrows = freeThrows;
                    this._2Pointers = _2Pointers;
                    this._3Pointers = _3Pointers;
                    this.fieldGoals = fieldGoals;
                    this.rebounds = rebounds;
                    this.fouls = fouls;
                    this.timeSpentInLead = timeSpentInLead;
                }
                    public class FreeThrows{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public FreeThrows(Integer home, Integer away) {
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

                    public class TwoPointers{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public TwoPointers(Integer home, Integer away) {
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
                    public class ThreePointers{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public ThreePointers(Integer home, Integer away) {
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
                    public class Rebounds{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public Rebounds(Integer home, Integer away) {
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
                    public class Fouls{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public Fouls(Integer home, Integer away) {
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
                    public class TimeSpentInLead{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public TimeSpentInLead(Integer home, Integer away) {
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

                    public class FieldGoals{
                        @SerializedName("home")
                        @Expose
                        private Integer home;
                        @SerializedName("away")
                        @Expose
                        private Integer away;

                        public FieldGoals(Integer home, Integer away) {
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

                public FreeThrows getFreeThrows() {
                    return freeThrows;
                }

                public TwoPointers get_2Pointers() {
                    return _2Pointers;
                }

                public ThreePointers get_3Pointers() {
                    return _3Pointers;
                }

                public FieldGoals getFieldGoals() {
                    return fieldGoals;
                }

                public Rebounds getRebounds() {
                    return rebounds;
                }

                public Fouls getFouls() {
                    return fouls;
                }

                public TimeSpentInLead getTimeSpentInLead() {
                    return timeSpentInLead;
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
                private Integer yearEnd;

                public Season(Integer id, String slug, String name, Integer yearStart, Integer yearEnd) {
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

                public Integer getYearEnd() {
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

      public Object getTimeDetails() {
          return timeDetails;
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

      public Integer getSeriesCount() {
          return seriesCount;
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


