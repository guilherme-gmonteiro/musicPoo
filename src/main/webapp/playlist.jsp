<%@page import="java.util.ArrayList"%>
<%@page import="Models.Musica"%>
<%@page import="Models.Usuario"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html >
    <head>
        <meta charset="UTF-8">
        <title>Player de Música - Tades</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">


        <link rel="stylesheet" href="css/style.css">
         <link rel="stylesheet" href="css/layout.css" type="text/css">

    </head>

    <body>
        <jsp:include page="parts/header.jsp"></jsp:include>
        <div class="container">
            <div class="column center">
                <br>
                <h6>Playlist Tal</h6>
            </div>
            <div class="column add-bottom">
                <div id="mainwrap">
                    <div id="nowPlay">
                        <span class="left" id="npAction">Paused...</span>
                        <span class="right" id="npTitle"></span>
                    </div>
                    <div id="audiowrap">
                        <div id="audio0">
                            <audio preload id="audio1" controls="controls">Your browser does not support HTML5 Audio!</audio>
                        </div>
                        <div id="tracks">
                            <a id="btnPrev">&laquo;</a>
                            <a id="btnNext">&raquo;</a>
                        </div>
                    </div>
                    <div id="plwrap">
                        <ul id="plList">
                            <li>
                                <div class="plItem">
                                    <div class="plNum">01.</div>
                                    <div class="plTitle">All This Is - Joe L.'s Studio</div>
                                    <div class="plLength">2:46</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">02.</div>
                                    <div class="plTitle">The Forsaken - Broadwing Studio (Final Mix)</div>
                                    <div class="plLength">8:31</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">03.</div>
                                    <div class="plTitle">All The King's Men - Broadwing Studio (Final Mix)</div>
                                    <div class="plLength">5:02</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">04.</div>
                                    <div class="plTitle">The Forsaken - Broadwing Studio (First Mix)</div>
                                    <div class="plLength">8:32</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">05.</div>
                                    <div class="plTitle">All The King's Men - Broadwing Studio (First Mix)</div>
                                    <div class="plLength">5:05</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">06.</div>
                                    <div class="plTitle">All This Is - Alternate Cuts</div>
                                    <div class="plLength">2:49</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">07.</div>
                                    <div class="plTitle">All The King's Men (Take 1) - Alternate Cuts</div>
                                    <div class="plLength">5:45</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">08.</div>
                                    <div class="plTitle">All The King's Men (Take 2) - Alternate Cuts</div>
                                    <div class="plLength">5:27</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">09.</div>
                                    <div class="plTitle">Magus - Alternate Cuts</div>
                                    <div class="plLength">5:46</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">10.</div>
                                    <div class="plTitle">The State Of Wearing Address (fucked up) - Alternate Cuts</div>
                                    <div class="plLength">5:25</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">11.</div>
                                    <div class="plTitle">Magus - Popeye's (New Years '04 - '05)</div>
                                    <div class="plLength">5:54</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">12.</div>
                                    <div class="plTitle">On The Waterfront - Popeye's (New Years '04 - '05)</div>
                                    <div class="plLength">4:41</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">13.</div>
                                    <div class="plTitle">Trance - Popeye's (New Years '04 - '05)</div>
                                    <div class="plLength">13:17</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">14.</div>
                                    <div class="plTitle">The Forsaken - Popeye's (New Years '04 - '05)</div>
                                    <div class="plLength">8:13</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">15.</div>
                                    <div class="plTitle">The State Of Wearing Address - Popeye's (New Years '04 - '05)</div>
                                    <div class="plLength">7:03</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">16.</div>
                                    <div class="plTitle">Magus - Popeye's (Valentine's Day '05)</div>
                                    <div class="plLength">5:44</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">17.</div>
                                    <div class="plTitle">Trance - Popeye's (Valentine's Day '05)</div>
                                    <div class="plLength">10:47</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">18.</div>
                                    <div class="plTitle">The State Of Wearing Address - Popeye's (Valentine's Day '05)</div>
                                    <div class="plLength">5:37</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">19.</div>
                                    <div class="plTitle">All This Is - Smith St. Basement (01/08/04)</div>
                                    <div class="plLength">2:49</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">20.</div>
                                    <div class="plTitle">Magus - Smith St. Basement (01/08/04)</div>
                                    <div class="plLength">5:46</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">21.</div>
                                    <div class="plTitle">Beneath The Painted Eye - Smith St. Basement (06/06/03)</div>
                                    <div class="plLength">13:08</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">22.</div>
                                    <div class="plTitle">Innocence - Smith St. Basement (06/06/03)</div>
                                    <div class="plLength">5:16</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">23.</div>
                                    <div class="plTitle">Magus - Smith St. Basement (06/06/03)</div>
                                    <div class="plLength">5:47</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">24.</div>
                                    <div class="plTitle">Madness Explored - Smith St. Basement (06/06/03)</div>
                                    <div class="plLength">4:52</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">25.</div>
                                    <div class="plTitle">The Forsaken - Smith St. Basement (06/06/03)</div>
                                    <div class="plLength">8:44</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">26.</div>
                                    <div class="plTitle">All This Is - Smith St. Basement (12/28/03)</div>
                                    <div class="plLength">3:01</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">27.</div>
                                    <div class="plTitle">Magus - Smith St. Basement (12/28/03)</div>
                                    <div class="plLength">6:10</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">28.</div>
                                    <div class="plTitle">Madness Explored - Smith St. Basement (12/28/03)</div>
                                    <div class="plLength">5:06</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">29.</div>
                                    <div class="plTitle">Trance - Smith St. Basement (12/28/03)</div>
                                    <div class="plLength">12:33</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">30.</div>
                                    <div class="plTitle">The Forsaken - Smith St. Basement (12/28/03)</div>
                                    <div class="plLength">8:57</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">31.</div>
                                    <div class="plTitle">All This Is (Take 1) - Smith St. Basement (Nov. '03)</div>
                                    <div class="plLength">4:55</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">32.</div>
                                    <div class="plTitle">All This Is (Take 2) - Smith St. Basement (Nov. '03)</div>
                                    <div class="plLength">5:46</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">33.</div>
                                    <div class="plTitle">Beneath The Painted Eye (Take 1) - Smith St. Basement (Nov. '03)</div>
                                    <div class="plLength">14:06</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">34.</div>
                                    <div class="plTitle">Beneath The Painted Eye (Take 2) - Smith St. Basement (Nov. '03)</div>
                                    <div class="plLength">13:26</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">35.</div>
                                    <div class="plTitle">The Forsaken (Take 1) - Smith St. Basement (Nov. '03)</div>
                                    <div class="plLength">8:38</div>
                                </div>
                            </li>
                            <li>
                                <div class="plItem">
                                    <div class="plNum">36.</div>
                                    <div class="plTitle">The Forsaken (Take 2) - Smith St. Basement (Nov. '03)</div>
                                    <div class="plLength">8:37</div>
                                </div>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </div>
        <script src='http://cdnjs.cloudflare.com/ajax/libs/jquery/3.0.0/jquery.min.js'></script>
        <script src='http://api.html5media.info/1.1.8/html5media.min.js'></script>

        <script src="js/index.js"></script>

    </body>
</html>
